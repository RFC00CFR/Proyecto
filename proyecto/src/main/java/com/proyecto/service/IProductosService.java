package com.proyecto.service;

import com.proyecto.entity.Productos;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface IProductosService {

    public List<Productos> getAllProductos();

    public void createProductos(Productos productos);

    public Productos getProductosById(int id);

    public void deleteProductos(int id);

    public boolean existeProductosById(int id);

    public int cantidadProductos();
}
