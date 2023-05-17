package com.orden.service.orden_service.persistence.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Entity
@Getter
@Setter
@Table(name = "tbl_paciente")
public class Patients {

    //faltan las relaciones en esta tabla.
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int IdPaciente;

    @Column
    private int IdIdentificacion;

    @Column
    private String NumIdentificacion;

    @Column
    private int NumExpediente;

    @Column
    private String NumINSS;

    @Column
    private int IdEstadoCivil;

    @Column
    private String Email;

    @Column
    private int IdSexo;

    @Column
    private int IdNacionalidad;

    @Column
    private int IdPaisNac;

    @Column
    private int IdDepartamentoNac;

    @Column
    private int IdMunicipioNac;

    @Column
    private int IdPaisRes;

    @Column
    private int IdDepartamentoRes;

    @Column
    private int IdMunicipioRes;

    @Column
    private int IdTipoSangre;

    @Column
    private int IdProfesiones;

    @Column
    private int idReligion;

    @Column
    private String PrimerNombre;

    @Column
    private String SegundoNombre;

    @Column
    private String PrimerApellido;

    @Column
    private String SegundoApellido;

    @Column
    private Date FechaNac;

    @Column
    private String DireccionDomiciliar;

    @Column
    private String TelefonoDomiciliar;

    @Column
    private String TelefonoMovil;

    @Column
    private String Activo;

    @Column
    private String Emabrazada;

    @Column
    private String Fallecido;

    @Column
    private int Estado;



    // Constructor, getters, and setters
    // ...
}
