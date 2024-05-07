package com.example.Jardineria.ModuloAPedido.DTO;

import lombok.Data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public record TrazabilidadPedidoDTO(String codigoEstado, String fecha, String codigoPedido, String nombreEstado) {



    public TrazabilidadPedidoDTO(String codigoEstado, String fecha, String codigoPedido, String nombreEstado) {
        this.codigoEstado = codigoEstado;
        this.fecha =fecha;
        this.codigoPedido = codigoPedido;
        this.nombreEstado = nombreEstado;

    }


    }


