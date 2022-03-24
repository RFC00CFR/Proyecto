package com.proyecto.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "productos")
public class Productos implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter private int id;
    @Getter @Setter private String nombre;

    @Getter @Setter private int precio;
    @Getter @Setter private int cantidad;
    @Getter @Setter private String descripcion;

    @ManyToOne
    @JoinColumn(name = "idmarca")
    @Getter @Setter private Marca idmarca;
    @ManyToOne
    @JoinColumn(name = "idurl")
    @Getter @Setter private Url idurl;
    @ManyToOne
    @JoinColumn(name = "idcategoria")
    @Getter @Setter private Categorias idcategoria;

    
 


}
