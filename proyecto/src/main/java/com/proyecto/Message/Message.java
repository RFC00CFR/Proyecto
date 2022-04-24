package com.proyecto.Message;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "messages")
public class Message implements Serializable {

    @Id
    @Column(name = "idconsultas")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private int idconsultas;

    @Getter
    @Setter
    private String nombre;

    @Getter
    @Setter
    private String email;
    @Getter
    @Setter
    private String mensaje;

}
