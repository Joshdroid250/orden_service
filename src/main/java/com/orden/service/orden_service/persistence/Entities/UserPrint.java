package com.orden.service.orden_service.persistence.Entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Data
@Getter
@Setter
@Table(name = "tbl_usuarios")

public class UserPrint {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int IdUsuario;

    @ManyToOne
    @JoinColumn
    private Employee IdEmpleado;

    @Column
    private String Login;

    @Column
    private String Pwd;

    @Column
    private String Activo;

    @Column
    private int Estado;

    @Column
    private int IdUsuarioCreacion;

    @Column
    private int IdUsuarioModificacion;

    @Column
    private int IdUsuarioEliminacion;

    @Column
    private Date FechaCreacion;

    @Column
    private Date FechaModificacion;

    @Column
    private Date FechaEliminacio;
}
