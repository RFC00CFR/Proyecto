package com.proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FaqController {

    @GetMapping("faq")
    public String getFaq(Model model) {
        model.addAttribute("url", "faq");
        model.addAttribute("titulo", "FAQ");
        model.addAttribute("link", "/faq");
        return "faq";
    }
}
