package com.proyecto.controller;

import com.proyecto.entity.Productos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.proyecto.service.IProductosService;

@Controller
public class ProductosController {

    @Autowired
    private IProductosService productosService;

    @GetMapping("/productos")
    public String index(Model model) {
        List<Productos> listaProductos = productosService.getAllProductos();
        model.addAttribute("titulo", "Productos");
        model.addAttribute("productos", listaProductos);
        return "productos";
    }

    @GetMapping("productosN")
    public String crearProducto(Model model) {
        model.addAttribute("persona", new Productos());
        return "crear";
    }

    @PostMapping("/save")
    public String guardarProducto(@ModelAttribute Productos producto) {
        productosService.createProductos(producto);
        return "redirect:/personas";
    }

    @GetMapping("/delete/{id}")
    public String eliminarProducto(@PathVariable("id") Long idProductos) {
        productosService.deleteProductos(idProductos);
        return "redirect:/personas";
    }
}

