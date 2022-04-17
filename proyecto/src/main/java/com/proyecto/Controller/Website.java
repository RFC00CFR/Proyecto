package com.proyecto.Controller;

import com.proyecto.Role.Role;
import com.proyecto.Role.RoleRepository;
import com.proyecto.User.UsuarioDetailsService;
import com.proyecto.User.User;
import com.proyecto.User.UserRepository;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Website {

    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private UsuarioDetailsService userService;

//    *** Index *** Begining
    @GetMapping("/index")
    public String getIndex(Model model) {
        model.addAttribute("url", "home");
        model.addAttribute("link", "/home");
        return "index";
    }

    @GetMapping("/")
    public String getRoot(Model model) {
        model.addAttribute("url", "home");
        model.addAttribute("link", "/home");
        return "index";
    }

    @GetMapping("/home")
    public String getHome(Model model) {
        model.addAttribute("url", "home");
        model.addAttribute("link", "/home");
        return "index";
    }
//    *** Index *** Ending

    
    
//    *** Register *** Begining
    @GetMapping("login")
    public String getLogin(Model model) {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null || authentication instanceof AnonymousAuthenticationToken) {
            model.addAttribute("url", "login");
            model.addAttribute("titulo", "Log In");
            return "login";
        }

        return "redirect:/";
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "signup_form";
    }

    @PostMapping("/process_register")
    public String processRegister(User user) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());

        Set<Role> roles = new HashSet<>();
        Role userRole = roleRepository.getRoleByName("LEVEL1");
        roles.add(userRole);

        DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        Date today = Calendar.getInstance().getTime();
        String date = df.format(today);

        user.setRoles(roles);
        user.setEnabled(true);
        user.setPassword(encodedPassword);
        user.setInscription(date);
        userService.defaultRole(user);
        userRepository.save(user);

        return "register_success";
    }

//    *** Register*** Ending

    
    
    
//    *** Frequently Asked Questions *** Begining
    @GetMapping("/faq")
    public String getFaq(Model model) {
        model.addAttribute("url", "faq");
        model.addAttribute("titulo", "FAQ");
        model.addAttribute("link", "/faq");
        return "faq";
    }
//    *** Frequently Asked Questions *** Ending

    
    
    
//    *** Contact Us *** Begining
    @GetMapping("/contact")
    public String getContact(Model model) {
        model.addAttribute("url", "contact");
        model.addAttribute("titulo", "Contacto");
        model.addAttribute("link", "/contact");
        return "contact";
    }
//    *** Contact Us *** Ending

    
    
    
//    *** Admin Page *** Begining
    @GetMapping("/adminpage")
    public String getAdminpage(Model model) {
        model.addAttribute("url", "adminpage");
        model.addAttribute("titulo", "Administrador");
        model.addAttribute("link", "/adminpage");
        return "adminpage";
    }
//    *** Admin Page *** Ending

    
    
    
}
