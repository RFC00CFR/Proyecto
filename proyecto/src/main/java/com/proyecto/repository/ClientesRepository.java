package com.proyecto.repository;


import com.proyecto.entity.Clientes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;@Repository
public interface ClientesRepository extends CrudRepository<Clientes,Integer> {
}


