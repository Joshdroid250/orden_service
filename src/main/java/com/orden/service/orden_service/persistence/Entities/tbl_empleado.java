package com.orden.service.orden_service.persistence.Entities;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tbl_empleado")
public class tbl_empleado {
    @Id
    @Column(name = "IdEmpleado")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idempleado;

    @ManyToOne
    @JoinColumn(name = "IdProfesiones")
    private tbl_cat_profesion idprofesiones;

    @Column(name = "idUsuarioCreacion")
    private int idusuariocreacion;

    @Column(name = "IdUsuarioEliminacion")
    private int idusuarioeliminacion;


    @Column(name = "IdUsuarioModificacion")
    private int idusuariomodificacion;


    @Column(name = "FechaCreacion")
    private java.util.Date fechacreacion;


    @Column(name = "FechaModificacion")
    private java.util.Date fechamodificacion;


    @Column(name = "fechaEliminacion")
    private java.util.Date fechaeliminacion;

    @Column(name = "IdMunicipioRes")
    private int idmunicipiores;

    @Column(name = "IdMunicipioNac")
    private int idmunicipionac;

    @Column(name = "IdDepartamentoNac")
    private int iddepartamentonac;

    @Column(name = "IdPaisNac")
    private int idpaisnac;

    @Column(name = "idPaisRes")
    private int idpaisres;

    @Column(name = "IdIdentificacion")
    private int ididentificacion;

    @Column(name = "IdEstadoCivil")
    private int idestadocivil;

    @Column(name = "IdSexo")
    private int idsexo;

    @Column(name = "IdNacionalidad")
    private int idnacionalidad;

    @Column(name = "NumINSS")
    private String numinss;

    @Column(name = "CodMinsa")
    private String codminsa;

    @Column(name = "PrimerNombre")
    private String primernombre;

    @Column(name = "SegundoNombre")
    private String segundonombre;

    @Column(name = "PrimerApellido")
    private String primerapellido;

    @Column(name = "FechaNac")
    private java.util.Date fechanac;

    @Column(name = "EdadIngreso")
    private String edadingreso;

    @Column(name = "Email")
    private String email;

    @Column(name = "DireccionDomiciliar")
    private String direcciondomi;

    @Column(name = "TelefonoDomiliciar")
    private String telefonodomi;

    @Column(name = "TelefonoMovil")
    private String telefonomovil;

    @Column(name = "FechaContrato")
    private java.util.Date fechacontrato;

    @Column(name = "UrlFoto")
    private String urlfoto;

    @Column(name = "Activo")
    private String activo;

    @Column(name = "Estado")
    private int estado;


    public int getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
    }

    public tbl_cat_profesion getIdprofesiones() {
        return idprofesiones;
    }

    public void setIdprofesiones(tbl_cat_profesion idprofesiones) {
        this.idprofesiones = idprofesiones;
    }

    public int getIdusuariocreacion() {
        return idusuariocreacion;
    }

    public void setIdusuariocreacion(int idusuariocreacion) {
        this.idusuariocreacion = idusuariocreacion;
    }

    public int getIdusuarioeliminacion() {
        return idusuarioeliminacion;
    }

    public void setIdusuarioeliminacion(int idusuarioeliminacion) {
        this.idusuarioeliminacion = idusuarioeliminacion;
    }

    public int getIdusuariomodificacion() {
        return idusuariomodificacion;
    }

    public void setIdusuariomodificacion(int idusuariomodificacion) {
        this.idusuariomodificacion = idusuariomodificacion;
    }

    public Date getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    public Date getFechamodificacion() {
        return fechamodificacion;
    }

    public void setFechamodificacion(Date fechamodificacion) {
        this.fechamodificacion = fechamodificacion;
    }

    public Date getFechaeliminacion() {
        return fechaeliminacion;
    }

    public void setFechaeliminacion(Date fechaeliminacion) {
        this.fechaeliminacion = fechaeliminacion;
    }

    public int getIdmunicipiores() {
        return idmunicipiores;
    }

    public void setIdmunicipiores(int idmunicipiores) {
        this.idmunicipiores = idmunicipiores;
    }

    public int getIdmunicipionac() {
        return idmunicipionac;
    }

    public void setIdmunicipionac(int idmunicipionac) {
        this.idmunicipionac = idmunicipionac;
    }

    public int getIddepartamentonac() {
        return iddepartamentonac;
    }

    public void setIddepartamentonac(int iddepartamentonac) {
        this.iddepartamentonac = iddepartamentonac;
    }

    public int getIdpaisnac() {
        return idpaisnac;
    }

    public void setIdpaisnac(int idpaisnac) {
        this.idpaisnac = idpaisnac;
    }

    public int getIdpaisres() {
        return idpaisres;
    }

    public void setIdpaisres(int idpaisres) {
        this.idpaisres = idpaisres;
    }

    public int getIdidentificacion() {
        return ididentificacion;
    }

    public void setIdidentificacion(int ididentificacion) {
        this.ididentificacion = ididentificacion;
    }

    public int getIdestadocivil() {
        return idestadocivil;
    }

    public void setIdestadocivil(int idestadocivil) {
        this.idestadocivil = idestadocivil;
    }

    public int getIdsexo() {
        return idsexo;
    }

    public void setIdsexo(int idsexo) {
        this.idsexo = idsexo;
    }

    public int getIdnacionalidad() {
        return idnacionalidad;
    }

    public void setIdnacionalidad(int idnacionalidad) {
        this.idnacionalidad = idnacionalidad;
    }

    public String getNuminss() {
        return numinss;
    }

    public void setNuminss(String numinss) {
        this.numinss = numinss;
    }

    public String getCodminsa() {
        return codminsa;
    }

    public void setCodminsa(String codminsa) {
        this.codminsa = codminsa;
    }

    public String getPrimernombre() {
        return primernombre;
    }

    public void setPrimernombre(String primernombre) {
        this.primernombre = primernombre;
    }

    public String getSegundonombre() {
        return segundonombre;
    }

    public void setSegundonombre(String segundonombre) {
        this.segundonombre = segundonombre;
    }

    public String getPrimerapellido() {
        return primerapellido;
    }

    public void setPrimerapellido(String primerapellido) {
        this.primerapellido = primerapellido;
    }

    public Date getFechanac() {
        return fechanac;
    }

    public void setFechanac(Date fechanac) {
        this.fechanac = fechanac;
    }

    public String getEdadingreso() {
        return edadingreso;
    }

    public void setEdadingreso(String edadingreso) {
        this.edadingreso = edadingreso;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDirecciondomi() {
        return direcciondomi;
    }

    public void setDirecciondomi(String direcciondomi) {
        this.direcciondomi = direcciondomi;
    }

    public String getTelefonodomi() {
        return telefonodomi;
    }

    public void setTelefonodomi(String telefonodomi) {
        this.telefonodomi = telefonodomi;
    }

    public String getTelefonomovil() {
        return telefonomovil;
    }

    public void setTelefonomovil(String telefonomovil) {
        this.telefonomovil = telefonomovil;
    }

    public Date getFechacontrato() {
        return fechacontrato;
    }

    public void setFechacontrato(Date fechacontrato) {
        this.fechacontrato = fechacontrato;
    }

    public String getUrlfoto() {
        return urlfoto;
    }

    public void setUrlfoto(String urlfoto) {
        this.urlfoto = urlfoto;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
