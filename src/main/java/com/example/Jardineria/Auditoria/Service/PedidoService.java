package com.example.Jardineria.ModuloAPedido.Service;


import com.example.Jardineria.ModuloAPedido.Entity.Pedido;
import com.example.Jardineria.ModuloAPedido.Repository.PedidoRepository;
import com.example.Jardineria.ModuloDProducto.Mapper.ProductoNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PedidoService {
    private final Logger logger;

    @Autowired
    public PedidoService(Logger logger) {
        this.logger = logger;
    }

    public void actualizarEstadoPedido(Pedido pedido, String nuevoEstado) {
        // Actualizar el estado del pedido
        pedido.setEstado(nuevoEstado);
        // Registrar el cambio de estado en el log
        logger.logEstadoPedido(pedido, nuevoEstado);
    }
} private final Logger logger;

@Autowired
public PedidoService(Logger logger) {
    this.logger = logger;
}

public void actualizarEstadoPedido(Pedido pedido, String nuevoEstado) {
    // Actualizar el estado del pedido
    pedido.setEstado(nuevoEstado);
    // Registrar el cambio de estado en el log
    logger.logEstadoPedido(pedido, nuevoEstado);
}
}