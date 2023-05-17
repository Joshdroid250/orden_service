package com.orden.service.orden_service.persistence.Entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity
@Data
@Getter
@Setter
@Table(name = "tbl_cat_tipoorden")
public class OrderType {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idTipoOrden;

    @Column
    private String Descripcion;

}
