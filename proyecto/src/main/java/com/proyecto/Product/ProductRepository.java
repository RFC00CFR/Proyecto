package com.proyecto.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Query("SELECT u FROM Product u WHERE u.nombre = :nombre")
    public Product getProductByNombre(@Param("nombre") String nombre);

    @Query("SELECT u FROM Product u WHERE u.id = :id")
    public Product getProductById(@Param("id") Integer id);
}
