package com.proyecto.User;

import com.proyecto.Role.RoleRepository;
import com.proyecto.Role.Role;
import java.security.Principal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @Autowired
    public UserRepository userRepo;

    @Autowired
    public RoleRepository roleRepo;

    @Autowired
    public UsuarioDetailsService Details;

    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @GetMapping("/account")
    public String showRegistrationForm(Principal user, Model model) {
        String nombre = user.getName();

        User usuario = userRepo.getUserByUsername(nombre);
        List<Role> listRoles = roleRepo.findAll();
        model.addAttribute("user", usuario);
        model.addAttribute("listRoles", listRoles);

        return "account";
    }

    @GetMapping("/users")
    public String users(Model model) {
        List<User> listUsers = userRepo.findAll();
        model.addAttribute("listUsers", listUsers);
        return "users";
    }

    @GetMapping("/deleteUsers/{usuario}")
    public String eliminarProducto(@PathVariable("usuario") String usuario) {
        User resu = userRepo.getUserByUsername(usuario);
        resu.setRoles(null);
        userRepo.delete(resu);

        return "redirect:/users";
    }

    @GetMapping("/editUser/{id}")
    public String editarusuario(@PathVariable("id") String usuario, Model model) {
        User resu = userRepo.getUserByUsername(usuario);
        model.addAttribute("user", resu);
        return "editUser";
    }

    @PostMapping("/saveUser")
    public String guardarProducto(@ModelAttribute User user, @RequestParam("oldPassword") String oldPassword, @RequestParam("contrasena") String contrasena) {

        if(userRepo.existByUsername(user.getSurname()) ){
            if (BCrypt.checkpw(oldPassword, contrasena) && !user.getPassword().isEmpty()) {
                user.setPassword(passwordEncoder().encode(user.getPassword()));
                userRepo.save(user);
                return "redirect:/account";
            } else if (BCrypt.checkpw(oldPassword, contrasena) && user.getPassword().isEmpty()) {
                user.setPassword(contrasena);
                userRepo.save(user);
                return "redirect:/account";
            }
        }
        else {
            return "redirect:/account";
        }
        return null;
    }

    @PostMapping("/saveEditedUser")
    public String saveEditedUser(@ModelAttribute User user) {
        String regex = "^\\$2[ayb]\\$.{56}$";
        if (user.getPassword().matches(regex)) {
            return "redirect:/users";
        } else {
            user.setPassword(passwordEncoder().encode(user.getPassword()));
            userRepo.save(user);
            return "redirect:/users";
        }
    }
    
    
}
