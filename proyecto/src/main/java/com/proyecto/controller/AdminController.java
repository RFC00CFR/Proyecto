/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("/adminpage")
    public String getAdminpage(Model model) {
        model.addAttribute("url", "adminpage");
        model.addAttribute("titulo", "Administrador");
        model.addAttribute("link", "/adminpage");
        return "adminpage";
    }
}
