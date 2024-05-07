package com.example.Jardineria.ModuloAPedido.Repository;

import com.example.Jardineria.ModuloAPedido.DTO.TrazabilidadPedidoDTO;
import com.example.Jardineria.ModuloAPedido.Entity.TrazabilidadPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrazabilidadPedidoRepository extends JpaRepository<TrazabilidadPedido, String> {
}
