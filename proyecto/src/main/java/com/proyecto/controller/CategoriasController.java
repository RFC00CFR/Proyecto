package com.proyecto.controller;

import com.proyecto.entity.Categorias;
import com.proyecto.service.ICategoriasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CategoriasController {

    @Autowired
    private ICategoriasService categoriasService;

    @GetMapping("/categorias")
    public String categoria(Model model) {
        List<Categorias> listaMarcas = categoriasService.getAllCategorias();
        model.addAttribute("titulo", "Categorias");
        model.addAttribute("categorias", listaMarcas);
        return "categorias";
    }

    @GetMapping("categoriasN")
    public String crearCategorias(Model model) {
        List<Categorias> listaCategoria = categoriasService.getAllCategorias();
        model.addAttribute("categoriap", new Categorias());
        model.addAttribute("categorias", listaCategoria);
        return "categoriasN";
    }

    @PostMapping("/saveCategorias")
    public String guardarCategorias(@ModelAttribute Categorias categoria) {
        categoriasService.createCategorias(categoria);
        return "redirect:/categorias";
    }

    @GetMapping("/editCategorias/{id}")
    public String editarCategorias(@PathVariable("id") int idcategoria, Model model) {
        Categorias p = categoriasService.getCategoriasById(idcategoria);
        List<Categorias> listaCategoria = categoriasService.getAllCategorias();
        model.addAttribute("categoriap", p);
        model.addAttribute("categorias", listaCategoria);
        return "categoriasN";
    }

    @GetMapping("/deleteCategorias/{id}")
    public String eliminarCategorias(@PathVariable("id") int idcategoria) {
        categoriasService.deleteCategorias(idcategoria);
        return "redirect:/categorias";
    }

}
