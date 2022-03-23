package com.proyecto.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
public class Productos implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;

    private int precio;
    private int cantidad;
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "idmarca")
    private Marca idmarca;
    @ManyToOne
    @JoinColumn(name = "idurl")
    private Url idurl;
    @ManyToOne
    @JoinColumn(name = "idcategoria")
    private Categorias idcategoria;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Marca getIdmarca() {
        return idmarca;
    }

    public void setIdmarca(Marca idmarca) {
        this.idmarca = idmarca;
    }

    public Url getIdurl() {
        return idurl;
    }

    public void setIdurl(Url idurl) {
        this.idurl = idurl;
    }

    public Categorias getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(Categorias idcategoria) {
        this.idcategoria = idcategoria;
    }
    
 


}
