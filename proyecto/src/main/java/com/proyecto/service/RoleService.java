package com.proyecto.service;

import com.proyecto.entity.Role;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.proyecto.repository.RoleRepository;

@Service
public class RoleService implements IRoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<Role> getAllRole() {
        return (List<Role>) roleRepository.findAll();
    }

    @Override
    public void createRole(Role role) {
        roleRepository.save(role);
    }

    @Override
    public Role getRoleById(long id) {
        return roleRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteRole(long id) {
        roleRepository.deleteById(id);
    }

    @Override
    public boolean existeRoleById(long id) {
        return roleRepository.existsById(id);
    }

}
