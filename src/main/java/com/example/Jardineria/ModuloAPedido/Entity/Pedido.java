package com.example.Jardineria.ModuloAPedido.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Pedido {
    @Id
    private Integer codigoPedido;
    private Date fecha;
    private String comentarios;
    private Integer codigoCliente;
    private String codigoEstado;


    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy ="pedido")
    @JsonIgnore
    private List<TrazabilidadPedido> trazabilidadPedido;

    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy ="pedido")
    @JsonIgnore
    private List<EstadoPedido> estadoPedido;


}
