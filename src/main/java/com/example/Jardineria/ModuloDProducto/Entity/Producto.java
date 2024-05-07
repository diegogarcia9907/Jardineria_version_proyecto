package com.example.Jardineria.ModuloDProducto.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Producto {
    @Id
    private  String codigoProducto;
    private  String nombre;
    private  String dimensiones;
    private  String descripcion;
    private  Integer cantidadEnStock;
    private  Integer precioVenta;
    private  Integer precioProveedor;


    @ManyToOne
    @JoinColumn(name="codigo_gama")
    @JsonIgnoreProperties({"descripcion", "codigoGama"})
    private GamaProducto gamaProducto;

    @ManyToOne
    @JoinColumn(name="Codigo_Proveedor")
    @JsonIgnoreProperties({"codigoProveedor", "direccionPrincipal", "numeroTelefonico", "correoElectronico"})
    private Proveedores proveedores;
}
