package com.proyecto.service;

import com.proyecto.entity.Roles;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface IRoleService {

    public List<Roles> getAllRole();

    public void createRole(Roles role);

    public Roles getRoleById(int id);

    public void deleteRole(int id);

    public boolean existeRoleById(int id);

}
