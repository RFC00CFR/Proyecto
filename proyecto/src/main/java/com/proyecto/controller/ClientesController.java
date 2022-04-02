package com.proyecto.controller;

import com.proyecto.entity.Clientes;
import com.proyecto.entity.User;
import com.proyecto.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClientesController {

    @Autowired
    private UserService userService;

    @GetMapping("/clientes")
    public String users(Model model) {
        List<User> listaUser = userService.getAllUser();
        model.addAttribute("titulo", "Clientes");
        model.addAttribute("users", listaUser);
        model.addAttribute("link", "/clientes");
        return "clientes";
    }

    @GetMapping("clientesN")
    public String crearProducto(Model model) {
        List<User> listaUser = userService.getAllUser();
        model.addAttribute("clientep", new User());

        return "clientesN";
    }

    @PostMapping("/saveClientes")
    public String guardarProducto(@ModelAttribute User user) {
        userService.createUser(user);
        return "redirect:/clientes";
    }

    @GetMapping("/editClientes/{id}")
    public String editarClientes(@PathVariable("id") int id, Model model) {
        User p = userService.getUserById(id);
//        List<Categorias> listaCategorias = categoriasService.getAllCategorias();
//        List<Marca> listaMarca = marcaService.getAllMarca();
//        List<Url> listaUrl = urlService.getAllUrl();
        model.addAttribute("clientep", p);
//        model.addAttribute("categorias", listaCategorias);
//        model.addAttribute("marcas", listaMarca);
//        model.addAttribute("urls", listaUrl);
        return "clientesN";
    }

    @GetMapping("/deleteClientes/{id}")
    public String eliminarProducto(@PathVariable("id") int idProducto) {
        userService.deleteUser(idProducto);
        return "redirect:/clientes";
    }

}
