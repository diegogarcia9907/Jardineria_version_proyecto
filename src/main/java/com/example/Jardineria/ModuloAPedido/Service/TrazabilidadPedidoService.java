package com.example.Jardineria.ModuloAPedido.Service;

import com.example.Jardineria.ModuloAPedido.DTO.TrazabilidadPedidoDTO;
import com.example.Jardineria.ModuloAPedido.Entity.Pedido;
import com.example.Jardineria.ModuloAPedido.Entity.TrazabilidadPedido;

import com.example.Jardineria.ModuloAPedido.Repository.TrazabilidadPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Jardineria.ModuloAPedido.Repository.PedidoRepository;
import java.util.List;
import java.util.Optional;

@Service
public class TrazabilidadPedidoService {

    @Autowired
    private TrazabilidadPedidoRepository trazabilidadPedidoRepository;
    @Autowired
    private PedidoRepository pedidoRepository;


    public List<TrazabilidadPedido> getTrazabilidadPedidos(){
        return  trazabilidadPedidoRepository.findAll();
    }

    public Optional<TrazabilidadPedido> getTrazabilidadPedido(String codigoEstado){
        return trazabilidadPedidoRepository.findById(codigoEstado);
    }

    public void saveOrUpdate(TrazabilidadPedidoDTO trazabilidadPedidoDTO){
        TrazabilidadPedido trazabilidadPedido = new TrazabilidadPedido();
       trazabilidadPedido.setCodigoEstado(trazabilidadPedidoDTO.codigoEstado());
       trazabilidadPedido.setNombreEstado(trazabilidadPedido.getNombreEstado());

        trazabilidadPedidoRepository.save(trazabilidadPedido);
    }


    public void delete(String codigoEstado){
        trazabilidadPedidoRepository.deleteById(codigoEstado);
    }



}

