package com.proyecto.service;

import com.proyecto.entity.Roles;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.proyecto.repository.RoleRepository;

@Service
public class RoleService implements IRoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<Roles> getAllRole() {
        return (List<Roles>) roleRepository.findAll();
    }

    @Override
    public void createRole(Roles role) {
        roleRepository.save(role);
    }

    @Override
    public Roles getRoleById(int id) {
        return roleRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteRole(int id) {
        roleRepository.deleteById(id);
    }

    @Override
    public boolean existeRoleById(int id) {
        return roleRepository.existsById(id);
    }

}
