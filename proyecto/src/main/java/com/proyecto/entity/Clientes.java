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
@Table(name = "clientes")
public class Clientes implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter private int id;
    @Getter @Setter private String nombre;
    @Getter @Setter private String apellido1;
    @Getter @Setter private String apellido2;
    @Getter @Setter private String email;
    @Getter @Setter private String telefono;
    @Getter @Setter private String fecha_inscrip;
    @Getter @Setter private String enable;
    @Getter @Setter private String password;
    
    @ManyToOne
    @JoinColumn(name = "idrole")
    @Getter @Setter private Role idrole;




    
    
    

}
