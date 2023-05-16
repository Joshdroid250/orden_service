package com.orden.service.orden_service.persistence.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_cat_profesiones")
public class tbl_cat_profesion {
    @Id
    @Column(name = "IdProfesiones")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idProfesiones;


    @Column(name = "Descripcion", length = 50)
    private String descripcion;

    @Column(name = "Estado")
    private int estado;


    public int getIdProfesiones() {
        return idProfesiones;
    }

    public void setIdProfesiones(int idProfesiones) {
        this.idProfesiones = idProfesiones;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
