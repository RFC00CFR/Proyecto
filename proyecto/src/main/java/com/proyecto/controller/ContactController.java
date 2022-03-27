package com.proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactController {

    @GetMapping("contact")
    public String getContact(Model model) {
        model.addAttribute("url", "contact");
        model.addAttribute("titulo", "Contacto");
        model.addAttribute("link", "/contact");
        return "contact";
    }
}
