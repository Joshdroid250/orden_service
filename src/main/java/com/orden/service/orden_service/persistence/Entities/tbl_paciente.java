package com.orden.service.orden_service.persistence.Entities;

import jakarta.persistence.*;
import java.util.Date;
@Entity
@Table(name = "tbl_paciente")
public class tbl_paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IdPaciente")
    private int idPaciente;

    @Column(name = "IdIdentificacion")
    private int idIdentificacion;

    @Column(name = "NumIdentificacion", length = 20)
    private String numIdentificacion;

    @Column(name = "NumExpediente")
    private int numExpediente;

    @Column(name = "NumINSS", length = 15)
    private String numINSS;

    @Column(name = "IdEstadoCivil")
    private int idEstadoCivil;

    @Column(name = "Email", length = 150)
    private String email;

    @Column(name = "IdSexo")
    private int idSexo;

    @Column(name = "IdNacionalidad")
    private int idNacionalidad;

    @Column(name = "IdPaisNac")
    private int idPaisNac;

    @Column(name = "IdDepartamentoNac")
    private int idDepartamentoNac;

    @Column(name = "IdMunicipioNac")
    private int idMunicipioNac;

    @Column(name = "IdPaisRes")
    private int idPaisRes;

    @Column(name = "IdDepartamentoRes")
    private int idDepartamentoRes;

    @Column(name = "IdMunicipioRes")
    private int idMunicipioRes;

    @Column(name = "IdTipoSangre")
    private int idTipoSangre;

    @Column(name = "IdProfesiones")
    private int idProfesiones;

    @Column(name = "idReligion")
    private int idReligion;

    @Column(name = "PrimerNombre", length = 50)
    private String primerNombre;

    @Column(name = "SegundoNombre", length = 50)
    private String segundoNombre;

    @Column(name = "PrimerApellido", length = 50)
    private String primerApellido;

    @Column(name = "SegundoApellido", length = 50)
    private String segundoApellido;

    @Column(name = "FechaNac")
    private Date fechaNac;

    @Column(name = "DireccionDomiciliar", length = 150)
    private String direccionDomiciliar;

    @Column(name = "TelefonoDomiciliar", length = 10)
    private String telefonoDomiciliar;

    @Column(name = "TelefonoMovil", length = 10)
    private String telefonoMovil;

    @Column(name = "Activo", length = 1)
    private String activo;

    @Column(name = "Emabrazada", length = 1)
    private String embarazada;

    @Column(name = "Fallecido", length = 1)
    private String fallecido;

    @Column(name = "Estado")
    private int estado;

    // Constructor, getters, and setters
    // ...
}
