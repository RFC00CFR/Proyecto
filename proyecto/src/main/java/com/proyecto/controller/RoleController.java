package com.proyecto.controller;

import com.proyecto.entity.Roles;
import com.proyecto.service.IRoleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RoleController {
    
    @Autowired
    private IRoleService roleService;

    
    
    @GetMapping("/roles")
    public String marca(Model model) {
        List<Roles> listaRoles = roleService.getAllRole();
        model.addAttribute("titulo", "Roles");
        model.addAttribute("roles", listaRoles);
        return "roles";
    }

    @GetMapping("rolesN")
    public String crearRole(Model model) {
        List<Roles> listaRole = roleService.getAllRole();
        model.addAttribute("rolep", new Roles());
        model.addAttribute("roles", listaRole);
        return "rolesN";
    }

    @PostMapping("/saveRoles")
    public String guardarRole(@ModelAttribute Roles role) {
        roleService.createRole(role);
        return "redirect:/marcas";
    }

    

    @GetMapping("/editRoles/{id}")
    public String editarRole(@PathVariable("id") int idrole, Model model) {
        Roles p = roleService.getRoleById(idrole);
        List<Roles> listaRole = roleService.getAllRole();
        model.addAttribute("rolep", p);
        model.addAttribute("roles", listaRole);
        return "rolesN";
    }

    @GetMapping("/deleteRoles/{id}")
    public String eliminarRole(@PathVariable("id") int idrole) {
        roleService.deleteRole(idrole);
        return "redirect:/marcas";
    }
    
    
    
    
    
}