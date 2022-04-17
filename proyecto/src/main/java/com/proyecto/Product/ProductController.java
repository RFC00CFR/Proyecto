package com.proyecto.Product;

import com.proyecto.Category.Category;
import com.proyecto.Brand.Brand;
import com.proyecto.Brand.IBrandService;
import com.proyecto.Category.CategoryService;
import com.proyecto.Image.IImageService;
import com.proyecto.Image.Image;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class ProductController {

    @Autowired
    private CategoryService categoriasService;
    @Autowired
    private IProductService productosService;
    @Autowired
    private IBrandService marcaService;
    @Autowired
    private IImageService urlService;

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

    @GetMapping("productosN")
    public String crearProducto(Model model) {
        List<Category> listaCategorias = categoriasService.getAllCategorias();
        List<Brand> listaMarca = marcaService.getAllMarca();
        List<Image> listaUrl = urlService.getAllUrl();
        model.addAttribute("productos", new Product());
        model.addAttribute("categorias", listaCategorias);
        model.addAttribute("marcas", listaMarca);
        model.addAttribute("urls", listaUrl);
        return "productosN";
    }

    @PostMapping("/saveProducto")
    public String guardarProducto(@ModelAttribute Product producto) {
        productosService.createProductos(producto);
        return "redirect:/productos";
    }

    @GetMapping("/editProducto/{id}")
    public String editarProducto(@PathVariable("id") int idproducto, Model model) {
        Product p = productosService.getProductosById(idproducto);
        List<Category> listaCategorias = categoriasService.getAllCategorias();
        List<Brand> listaMarca = marcaService.getAllMarca();
        List<Image> listaUrl = urlService.getAllUrl();
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
