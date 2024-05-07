package com.example.Jardineria.ModuloAPedido.Service;


import com.example.Jardineria.ModuloAPedido.DTO.PedidoDTO1;
import com.example.Jardineria.ModuloAPedido.Entity.Pedido;
import com.example.Jardineria.ModuloAPedido.Repository.PedidoRepository;
import com.example.Jardineria.ModuloDProducto.Mapper.ProductoNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PedidoService {
    @Autowired
    PedidoRepository pedidoRepository;

    public List<Pedido> getPedidos(){
        return  pedidoRepository.findAll();
    }

    public Optional<Pedido> getPedido(String codigoPedido){
        return pedidoRepository.findById(codigoPedido);
    }

    public void save(PedidoDTO1 pedidoDTO1){
        Pedido pedido = new Pedido();
        Integer nuevoCodigoPedido = Integer.valueOf(generarCodigoPedido());


        pedido.setCodigoPedido(nuevoCodigoPedido);
        pedido.setFecha(pedidoDTO1.getFecha());
        pedido.setComentarios(pedidoDTO1.getComentarios());
        pedido.setCodigoEstado(pedidoDTO1.getCodigoEstado());
        pedido.setCodigoEstado(pedidoDTO1.getCodigoEstado());
        pedidoRepository.save(pedido);
    }
    public void update(PedidoDTO1 pedidoDTO1){
        Pedido pedido = new Pedido();






    }
    private int generarCodigoPedido() {
        int ultimoCodigoPedido = pedidoRepository.obtenerUltimoCodigoPedido();
        int ultimoNumero = Integer.parseInt(String.valueOf(ultimoCodigoPedido));//P040
        int nuevoNumero = ultimoNumero + 1;
        int nuevoCodigoPedido = nuevoNumero;
        return nuevoCodigoPedido;
    }



    public void delete(String codigoPedido){
        Pedido pedido = new Pedido();
        List <Pedido> listaPedido = pedidoRepository.findByCodigoPedido(Integer.valueOf(codigoPedido));
        if (!listaPedido.isEmpty()) {
            pedido = listaPedido.get(0);

        } else {

            throw new ProductoNotFoundException("No se encontró el pedido especificado");
        }
        pedidoRepository.deleteById(pedido.getCodigoPedido().toString());
    }

}
