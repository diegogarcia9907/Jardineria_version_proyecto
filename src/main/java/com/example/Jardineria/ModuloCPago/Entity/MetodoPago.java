package com.example.Jardineria.ModuloCPago.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class MetodoPago {
    @Id

    private String codigoMetodoPago;
    private String nombreMetodoPago;
}
