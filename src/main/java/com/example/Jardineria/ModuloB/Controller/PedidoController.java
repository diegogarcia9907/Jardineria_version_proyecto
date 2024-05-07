package com.example.Jardineria.ModuloB.Controller;
import com.example.Jardineria.ModuloAPedido.DTO.PedidoDTO1;
import com.example.Jardineria.ModuloAPedido.Entity.Pedido;
import com.example.Jardineria.ModuloAPedido.Repository.PedidoRepository;
import com.example.Jardineria.ModuloAPedido.Service.PedidoService;
import com.example.Jardineria.ModuloDProducto.DTO.ProductoDTO;
import com.example.Jardineria.ModuloDProducto.Entity.Producto;
import com.example.Jardineria.ModuloDProducto.Repository.ProductoRepository;
import com.example.Jardineria.ModuloDProducto.Service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@Service
@RestController
@RequestMapping("/Pedidos")
public class PedidoController {


@Autowired
private PedidoService pedidoService;
    @Autowired
    private PedidoRepository pedidoRepository;


    @GetMapping
    public List<Pedido> findAll(){
        return pedidoService.getPedidos();
    }


    @PostMapping("/crear")
    public void crearPedido(@RequestBody PedidoDTO1 pedidoDTO1) {
        pedidoService.save(pedidoDTO1);
    }
    @PatchMapping("/Actualizar")
    public void guardarPedido(@RequestBody PedidoDTO1 pedidoDTO1) {
        pedidoService.update(pedidoDTO1);
    }

    @DeleteMapping("/eliminar")
    public void delete(@RequestParam Integer codigoPedido){
        pedidoService.delete(String.valueOf(codigoPedido));
    }

    @GetMapping("/porCodigoPedido")
    public List<Pedido> buscarCodigoPedido(@RequestParam Integer codigoPedido) {
        return pedidoRepository.findByCodigoPedido(Integer.valueOf(codigoPedido));
    }
}
