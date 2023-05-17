package com.orden.service.orden_service.persistence.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "tbl_cat_profesiones")
public class Profession {
    @Id
    @Column(name = "IdProfesiones")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idProfesiones;


    @Column(name = "Descripcion", length = 50)
    private String descripcion;

    @Column(name = "Estado")
    private int estado;
}
