package com.proyecto.controller;

import com.proyecto.entity.Categorias;
import com.proyecto.entity.Marca;
import com.proyecto.entity.Productos;
import com.proyecto.entity.Url;
import com.proyecto.service.CategoriasService;
import com.proyecto.service.IMarcaService;
import com.proyecto.service.IProductosService;
import com.proyecto.service.IUrlService;
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
    private CategoriasService categoriasService;
    @Autowired
    private IProductosService productosService;
    @Autowired
    private IMarcaService marcaService;
    @Autowired
    private IUrlService urlService;

    @GetMapping("/productos")
    public String productos(Model model) {
        List<Productos> listaProductos = productosService.getAllProductos();
        model.addAttribute("titulo", "Productos");
        model.addAttribute("productos", listaProductos);
        return "productos";
    }

    @GetMapping("productosN")
    public String crearProducto(Model model) {
        List<Categorias> listaCategorias = categoriasService.getAllCategorias();
        List<Marca> listaMarca = marcaService.getAllMarca();
        List<Url> listaUrl = urlService.getAllUrl();
        model.addAttribute("productos", new Productos());
        model.addAttribute("categorias", listaCategorias);
        model.addAttribute("marcas", listaMarca);
        model.addAttribute("urls", listaUrl);
        return "productosN";
    }

    @PostMapping("/saveProducto")
    public String guardarProducto(@ModelAttribute Productos producto) {
        productosService.createProductos(producto);
        return "redirect:/productos";
    }

    @GetMapping("/editProducto/{id}")
    public String editarProducto(@PathVariable("id") int idproducto, Model model) {
        Productos p = productosService.getProductosById(idproducto);
        List<Categorias> listaCategorias = categoriasService.getAllCategorias();
        List<Marca> listaMarca = marcaService.getAllMarca();
        List<Url> listaUrl = urlService.getAllUrl();
        model.addAttribute("productos", p);
        model.addAttribute("categorias", listaCategorias);
        model.addAttribute("marcas", listaMarca);
        model.addAttribute("urls", listaUrl);
        return "productosN";
    }

    @GetMapping("/deleteProducto/{id}")
    public String eliminarProducto(@PathVariable("id") int idProducto) {
        productosService.deleteProductos(idProducto);
        return "redirect:/productos";
    }

}
