/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "role")
public class Role implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idrole;
    private String nombrerole;

    public int getIdrole() {
        return idrole;
    }

    public void setIdrole(int idrole) {
        this.idrole = idrole;
    }

    public String getNombrerole() {
        return nombrerole;
    }

    public void setNombrerole(String nombrerole) {
        this.nombrerole = nombrerole;
    }




}