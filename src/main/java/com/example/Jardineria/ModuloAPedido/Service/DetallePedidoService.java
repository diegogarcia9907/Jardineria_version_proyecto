package com.example.Jardineria.ModuloAPedido.Service;

import com.example.Jardineria.ModuloAPedido.Entity.DetallePedido;
import com.example.Jardineria.ModuloAPedido.Repository.DetallePedidoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class DetallePedidoService {
    @Autowired
    DetallePedidoRepository detallePedidoRepository;

    public List<DetallePedido> getDetallePedidos(){
        return  detallePedidoRepository.findAll();
    }

    public Optional<DetallePedido> getDetallePedido(String codigoPedido){
        return detallePedidoRepository.findById(codigoPedido);
    }

    public void saveOrUpdate(DetallePedido codigoPedido){
        detallePedidoRepository.save(codigoPedido);
    }


    public void delete(DetallePedido codigoPedido) {
        detallePedidoRepository.delete(codigoPedido);
    }

}
