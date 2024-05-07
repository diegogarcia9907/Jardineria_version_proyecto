package com.example.Jardineria.ModuloAPedido.DTO;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public record PedidoDTO(Integer codigoPedido, String fecha,String comentarios,Integer codigoCliente,String codigoEstado) {
    public PedidoDTO (Integer codigoPedido, String fecha,String comentarios,Integer codigoCliente,String codigoEstado) {
        this.codigoPedido = codigoPedido;
        this.fecha = calcularFechaDosDiasDespues();
        this.comentarios = comentarios;
        this.codigoCliente = codigoCliente;
        this.codigoEstado = codigoEstado;

    }
    private String calcularFechaDosDiasDespues() {
        // Obtener la fecha actual
        LocalDate fechaActual = LocalDate.now();

        // Sumar dos días a la fecha actual
        LocalDate fechaDosDiasDespues = fechaActual.plusDays(2);

        // Formatear la fecha en formato deseado
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return fechaDosDiasDespues.format(formatter);
    }

}


