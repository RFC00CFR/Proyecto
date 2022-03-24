package com.proyecto.controller;

import com.proyecto.entity.Url;
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
public class UrlController {

    @Autowired
    private IUrlService urlService;

    @GetMapping("/urls")
    public String url(Model model) {
        List<Url> listaUrl = urlService.getAllUrl();
        model.addAttribute("titulo", "Imagenes");
        model.addAttribute("urls", listaUrl);
        return "urls";
    }

    @GetMapping("urlsN")
    public String crearUrl(Model model) {
        List<Url> listaUrl = urlService.getAllUrl();
        model.addAttribute("urlp", new Url());
        model.addAttribute("urls", listaUrl);
        return "urlsN";
    }

    @PostMapping("/saveUrls")
    public String guardarUrl(@ModelAttribute Url url) {
        urlService.createUrl(url);
        return "redirect:/urls";
    }

    @GetMapping("/editUrls/{id}")
    public String editarUrl(@PathVariable("id") int idurl, Model model) {
        Url p = urlService.getUrlById(idurl);
        List<Url> listaUrl = urlService.getAllUrl();
        model.addAttribute("urlp", p);
        model.addAttribute("urls", listaUrl);
        return "urlsN";
    }

    @GetMapping("/deleteUrls/{id}")
    public String eliminarUrl(@PathVariable("id") int idurl) {
        urlService.deleteUrl(idurl);
        return "redirect:/urls";
    }

}
