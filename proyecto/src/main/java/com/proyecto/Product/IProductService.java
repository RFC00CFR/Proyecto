package com.proyecto.Product;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface IProductService {

    public List<Product> getAllProductos();

    public void createProductos(Product productos);

    public Product getProductosById(int id);

    public void deleteProductos(int id);

    public boolean existeProductosById(int id);

    public int cantidadProductos();
}
