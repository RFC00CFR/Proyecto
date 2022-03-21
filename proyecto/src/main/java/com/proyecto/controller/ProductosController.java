package com.proyecto.controller;

import com.proyecto.entity.Productos;
import com.proyecto.service.IProductosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductosController {

    @Autowired
    private IProductosService productosService;

    @GetMapping("login")
    public String getLogin() {
        return "login";
    }
    @GetMapping("home1")
    public String getHome1() {
        return "home1";
    }
    @GetMapping("courses")
    public String getCourses() {
        return "courses";
    }

    @GetMapping("faq")
    public String getFaq() {
        return "faq";
    }

    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

    @GetMapping("index")
    public String getIndex1() {
        return "index";
    }

    @GetMapping("contact")
    public String getContact() {
        return "contact";
    }

    @GetMapping("/productos")
    public String index(Model model) {
        System.out.println("Test");
        List<Productos> listaProductos = productosService.getAllProductos();
        model.addAttribute("titulo", "Productos");
        model.addAttribute("productos", listaProductos);
        return "productos";
    }

    @GetMapping("productosN")
    public String crearProducto(Model model) {
        model.addAttribute("productos", new Productos());
        return "productosN";
    }

    @PostMapping("/save")
    public String guardarProducto(@ModelAttribute Productos producto) {
        productosService.createProductos(producto);
        return "redirect:/productos";
    }

    @GetMapping("/delete/{id}")
    public String eliminarProducto(@PathVariable("id") Long idProductos) {
        productosService.deleteProductos(idProductos);
        return "redirect:/productos";
    }
}
