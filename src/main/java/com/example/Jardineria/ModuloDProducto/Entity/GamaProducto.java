package com.example.Jardineria.ModuloDProducto.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class GamaProducto {
    @Id
    protected String codigoGama;
    protected String gama;
    protected String descripcion;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "gamaProducto")
    @JsonIgnore
    private List<Producto> producto;
}
