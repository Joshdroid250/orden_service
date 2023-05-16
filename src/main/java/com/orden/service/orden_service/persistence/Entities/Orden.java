package com.orden.service.orden_service.persistence.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_ordenes")
public class Orden {
    @Id
    @Column(name = "idOrden")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idorden;

    @Column(name = "N_Orden")
    private String n_orden;


    @ManyToOne
    @JoinColumn(name = "IdEmpleado")
    private tbl_empleado idempleado;
}
