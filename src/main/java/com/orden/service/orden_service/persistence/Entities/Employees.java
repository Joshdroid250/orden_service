package com.orden.service.orden_service.persistence.Entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "tbl_empleado")
public class Employees {
    @Id
    @Column(name = "IdEmpleado")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idempleado;

    @ManyToOne
    @JoinColumn(name = "IdProfesiones")
    private Profession IdProfesiones;

    @Column
    private int idUsuarioCreacion;

    @Column
    private int IdUsuarioEliminacion;


    @Column
    private int IdUsuarioModificacion;


    @Column
    private Date FechaCreacion;


    @Column
    private Date FechaModificacion;


    @Column
    private Date fechaEliminacion;

    @Column
    private int IdMunicipioRes;

    @Column
    private int IdMunicipioNac;

    @Column
    private int IdDepartamentoNac;

    @Column
    private int IdPaisNac;

    @Column
    private int idPaisRes;

    @Column
    private int IdIdentificacion;

    @Column
    private int IdEstadoCivil;

    @Column
    private int IdSexo;

    @Column
    private int IdNacionalidad;

    @Column
    private String NumINSS;

    @Column
    private String CodMinsa;

    @Column
    private String PrimerNombre;

    @Column
    private String SegundoNombre;

    @Column
    private String PrimerApellido;

    @Column
    private java.util.Date FechaNac;

    @Column
    private String EdadIngreso;

    @Column
    private String Email;

    @Column
    private String DireccionDomiciliar;

    @Column
    private String TelefonoDomiliciar;

    @Column
    private String TelefonoMovil;

    @Column
    private Date FechaContrato;

    @Column
    private String UrlFoto;

    @Column
    private String Activo;

    @Column
    private int Estado;

}
