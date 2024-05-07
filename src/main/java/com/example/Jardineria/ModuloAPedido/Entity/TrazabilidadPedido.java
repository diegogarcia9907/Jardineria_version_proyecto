package com.example.Jardineria.ModuloAPedido.Entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity

public class TrazabilidadPedido {

    @Id
    private String codigoEstado;
    private String nombreEstado;


    @ManyToOne
    @JoinColumn(name="fecha")
    @JsonIgnoreProperties("{comentarios,codigoEstado}")
    private Pedido pedido;
}
