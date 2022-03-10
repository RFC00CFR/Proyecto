
package com.proyecto.entity;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="categorias")
public class Categorias implements Serializable{

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)

private long categoria_id;
private String nombre;

    public long getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(long categoria_id) {
        this.categoria_id = categoria_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }





}