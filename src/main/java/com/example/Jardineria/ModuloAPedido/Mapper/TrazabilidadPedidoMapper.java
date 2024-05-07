package com.example.Jardineria.ModuloAPedido.Mapper;
import com.example.Jardineria.ModuloAPedido.DTO.TrazabilidadPedidoDTO;
import com.example.Jardineria.ModuloAPedido.Entity.TrazabilidadPedido;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface TrazabilidadPedidoMapper {
    TrazabilidadPedidoDTO trazabilidadPedidoTrazabilidadPedidoDTO(TrazabilidadPedido trazabilidadPedido);
    TrazabilidadPedido trazabilidadPedidoDTOTrazabilidadPedido(TrazabilidadPedidoDTO trazabilidadPedidoDTO);
}
