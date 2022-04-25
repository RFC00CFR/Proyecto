package com.proyecto.Product;

import java.io.IOException;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class ProductController {

    @Autowired
    private IProductService productosService;

    @GetMapping("/productos")
    public String productos(Model model) {
        List<Product> listaProductos = productosService.getAllProductos();
        long cantidad = productosService.cantidadProductos();
        model.addAttribute("titulo", "Productos");
        model.addAttribute("productos", listaProductos);
        model.addAttribute("cantidad", cantidad);
        model.addAttribute("link", "/productos");
        return "productos";
    }

    @GetMapping("/productList")
    public String productList(Model model) {
        List<Product> listaProductos = productosService.getAllProductos();
        model.addAttribute("productos", listaProductos);

        return "productList";
    }

    @GetMapping("/crearProduct")
    public String crearProducto(Model model) {

        model.addAttribute("productos", new Product());

        return "crearProduct";
    }

    @PostMapping("/saveProducto")
    public String guardarProducto(@ModelAttribute Product producto, @RequestParam("image") MultipartFile multipartFile) throws IOException {

        String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
        producto.setUrl("/img/" + fileName);

        productosService.createProductos(producto);

        String uploadDir = "/img/";

        Image.saveImg(uploadDir, fileName, multipartFile);

        return "redirect:/productList";
//        
//        String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
//        producto.setUrl(fileName);
//        productosService.createProductos(producto);
//        Image.saveImg("/img/", fileName, multipartFile);
//
//        return "redirect:/productList";
    }

    @GetMapping("/editProduct/{id}")
    public String editarProducto(@PathVariable("id") int idproducto, Model model) {
        Product p = productosService.getProductosById(idproducto);
        model.addAttribute("productos", p);
        return "crearProduct";
    }

    @GetMapping("/deleteProduct/{id}")
    public String eliminarProduct(@PathVariable("id") int idProducto) {
        productosService.deleteProductos(idProducto);
        return "redirect:/productList";
    }

    @GetMapping("/image")
    public String image() {
        return "image";
    }

    @PostMapping("/saveImage")
    public String saveImage(@ModelAttribute Product producto) {
        productosService.createProductos(producto);
        return "redirect:/productList";
    }

}
