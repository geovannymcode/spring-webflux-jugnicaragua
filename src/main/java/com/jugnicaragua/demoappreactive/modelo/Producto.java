package com.jugnicaragua.demoappreactive.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table("productos")
public class Producto {

    @Id
    private Long id;
    private String nombre;
    private String descripcion;
    private String estado;
    private BigDecimal precio;

    public Producto(String nombre, String descripcion, String estado, BigDecimal precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
        this.precio = precio;
    }
}
