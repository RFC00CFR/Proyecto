
package com.proyecto.repository;

import com.proyecto.entity.Categorias;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CategoriasRepository extends CrudRepository<Categorias,Integer>{

}
