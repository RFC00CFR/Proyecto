
package com.proyecto.service;

import com.proyecto.entity.Productos;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductosService {

public List<Productos> getAllProductos();
public void createProductos(Productos productos);
public Productos getProductosById(long id);
public void deleteProductos(long id);
public boolean existeProductosById(long id);

}