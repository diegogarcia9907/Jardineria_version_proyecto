package com.example.Jardineria.ModuloAPedido.DTO;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Data
public class PedidoDTO1 {

    @Setter
    @Getter
    private Date fecha;
    @Setter
    @Getter
    private String comentarios;
    @Setter
    @Getter
    private Integer codigoCliente;
    @Setter
    @Getter
    private String codigoEstado;



}
