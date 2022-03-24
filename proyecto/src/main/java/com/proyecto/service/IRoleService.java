package com.proyecto.service;

import com.proyecto.entity.Role;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface IRoleService {

    public List<Role> getAllRole();

    public void createRole(Role role);

    public Role getRoleById(int id);

    public void deleteRole(int id);

    public boolean existeRoleById(int id);

}
