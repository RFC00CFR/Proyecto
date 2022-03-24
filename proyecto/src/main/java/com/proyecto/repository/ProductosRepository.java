package com.proyecto.repository;


import com.proyecto.entity.Productos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductosRepository extends CrudRepository<Productos,Integer> {
}


