package com.proyecto.Product;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "productos")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private int id;
    @Getter
    @Setter
    private String nombre;

    @Getter
    @Setter
    private int precio;
    @Getter
    @Setter
    private int cantidad;
    @Getter
    @Setter
    private String descripcion;

    @Getter
    @Setter
    private String marca;

    @Getter
    @Setter
    private String url;

    @Getter
    @Setter
    private String categoria;

    public Product() {
    }

    public Product(int id) {
        this.id = id;
    }

}
