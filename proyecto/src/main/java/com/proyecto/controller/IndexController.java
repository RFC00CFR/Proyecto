package com.proyecto.controller;

import com.proyecto.entity.Productos;
import com.proyecto.service.IProductosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/index")
    public String getIndex(Model model) {
        model.addAttribute("url", "home");
        model.addAttribute("link", "/home");
        return "home";
    }

    @GetMapping("/")
    public String getRoot(Model model) {
        model.addAttribute("url", "home");
        model.addAttribute("link", "/home");
        return "home";
    }

    @GetMapping("/home")
    public String getHome(Model model) {
        model.addAttribute("url", "home");
        model.addAttribute("link", "/home");
        return "home";
    }

    @Autowired
    private IProductosService productosService;

    @GetMapping("/test")
    public String getTest(Model model) {
        List<Productos> listaProductos = productosService.getAllProductos();
        model.addAttribute("productos", listaProductos);
        model.addAttribute("url", "test");
        model.addAttribute("link", "/test");
        return "test";
    }
}
