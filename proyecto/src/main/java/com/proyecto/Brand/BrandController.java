package com.proyecto.Brand;

//import com.proyecto.entity.Marca;
//import com.proyecto.service.IMarcaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BrandController {
    

//    @Autowired
//    private IMarcaService marcaService;
//
//    
//    
//    @GetMapping("/marcas")
//    public String marca(Model model) {
//        List<Marca> listaMarcas = marcaService.getAllMarca();
//        model.addAttribute("titulo", "Marcas");
//        model.addAttribute("marcas", listaMarcas);
//        return "marcas";
//    }
//
//    @GetMapping("marcasN")
//    public String crearMarca(Model model) {
//        List<Marca> listaMarca = marcaService.getAllMarca();
//        model.addAttribute("marcap", new Marca());
//        model.addAttribute("marcas", listaMarca);
//        return "marcasN";
//    }
//
//    @PostMapping("/saveMarcas")
//    public String guardarMarca(@ModelAttribute Marca marca) {
//        marcaService.createMarca(marca);
//        return "redirect:/marcas";
//    }
//
//    
//
//    @GetMapping("/editMarcas/{id}")
//    public String editarMarca(@PathVariable("id") int idmarca, Model model) {
//        Marca p = marcaService.getMarcaById(idmarca);
//        List<Marca> listaMarca = marcaService.getAllMarca();
//        model.addAttribute("marcap", p);
//        model.addAttribute("marcas", listaMarca);
//        return "marcasN";
//    }
//
//    @GetMapping("/deleteMarcas/{id}")
//    public String eliminarMarca(@PathVariable("id") int idmarca) {
//        marcaService.deleteMarca(idmarca);
//        return "redirect:/marcas";
//    }
    
    
    
    
    
}
