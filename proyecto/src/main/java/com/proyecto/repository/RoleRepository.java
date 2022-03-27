package com.proyecto.repository;

import com.proyecto.entity.Roles;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface RoleRepository extends CrudRepository<Roles,Integer>{

}
