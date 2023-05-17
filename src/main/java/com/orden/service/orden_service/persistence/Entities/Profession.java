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
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int IdProfesiones;


    @Column
    private String Descripcion;

    @Column
    private int Estado;
}
