package com.example.Jardineria.ModuloAPedido.Repository;

import com.example.Jardineria.ModuloAPedido.Entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

public interface PedidoRepository extends JpaRepository<Pedido, String> {
    List<Pedido> findByCodigoPedido(Integer CodigoPedido);

    @Query(value = "SELECT MAX(g.codigoPedido) FROM Pedido g")
    int obtenerUltimoCodigoPedido();


}