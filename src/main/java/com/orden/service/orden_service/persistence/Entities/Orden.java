package com.orden.service.orden_service.persistence.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbl_ordenes")
///Entidad de orden que recibe datos de la base de datos.
public class Orden {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int IdOrden;

    @Column
    private String N_Orden;

    @ManyToOne
    @JoinColumn
    private Employee IdEmpleado;

    @ManyToOne
    @JoinColumn
    private Patients IdPaciente;

    @ManyToOne
    @JoinColumn
    private ServiceType IdTipoServicio;

    @ManyToOne
    @JoinColumn
    private OrderType IdTipoOrden;

    @Column
    private String Asistencia;

    @Column
    private String Observaciones;

    @Column
    private Date FechaOrden;

    @Column
    private String Activo;

    @Column
    private Date FechaImprime;

    @ManyToOne
    @JoinColumn
    private UserPrint IdUsuario;

    @Column
    private int Estado;

    @Column
    private String Finalizado;

    @Column
    private Date FechaCita;

    @Column
    private Date FechaPReporte;
}
