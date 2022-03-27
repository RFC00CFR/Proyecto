package com.proyecto.controller;

import com.proyecto.entity.Clientes;
import com.proyecto.service.ClientesService;
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
    private ClientesService clientesService;

    @GetMapping("/clientes")
    public String productos(Model model) {
        List<Clientes> listaClientes = clientesService.getAllClientes();
        model.addAttribute("titulo", "Clientes");
        model.addAttribute("clientes", listaClientes);
        model.addAttribute("link", "/clientes");
        return "clientes";
    }

    @GetMapping("clientesN")
    public String crearProducto(Model model) {
        List<Clientes> listaClientes = clientesService.getAllClientes();
//        List<Marca> listaMarca = marcaService.getAllMarca();
//        List<Url> listaUrl = urlService.getAllUrl();
        model.addAttribute("clientep", new Clientes());
//        model.addAttribute("categorias", listaCategorias);
//        model.addAttribute("marcas", listaMarca);
//        model.addAttribute("urls", listaUrl);
        return "clientesN";
    }

    @PostMapping("/saveClientes")
    public String guardarProducto(@ModelAttribute Clientes cliente) {
        clientesService.createClientes(cliente);
        return "redirect:/clientes";
    }

    @GetMapping("/editClientes/{id}")
    public String editarClientes(@PathVariable("id") int id, Model model) {
        Clientes p = clientesService.getClientesById(id);
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
        clientesService.deleteClientes(idProducto);
        return "redirect:/clientes";
    }

}
