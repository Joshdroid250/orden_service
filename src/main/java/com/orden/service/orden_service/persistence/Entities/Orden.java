package com.orden.service.orden_service.persistence.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbl_ordenes")
///Entidad de orden que recibe datos de la base de datos.
public class Orden {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idOrden;

    @Column
    private String N_Orden;


    @ManyToOne
    @JoinColumn
    private Employee IdEmpleado;


    @ManyToOne
    @JoinColumn
    private  OrderType Descripcion;

}
