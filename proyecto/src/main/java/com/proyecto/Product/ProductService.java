package com.proyecto.Product;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ProductService implements IProductService {

    @Autowired
    private ProductRepository productosRepository;

    @Override
    public List<Product> getAllProductos() {
        return (List<Product>) productosRepository.findAll();
    }

    @Override
    public void createProductos(Product productos) {
        productosRepository.save(productos);
    }

    @Override
    public Product getProductosById(int id) {
        return productosRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteProductos(int id) {
        productosRepository.deleteById(id);
    }

    @Override
    public boolean existeProductosById(int id) {
        return productosRepository.existsById(id);
    }

    @Override
    public int cantidadProductos() {
        return (int) productosRepository.count();
    }

}
