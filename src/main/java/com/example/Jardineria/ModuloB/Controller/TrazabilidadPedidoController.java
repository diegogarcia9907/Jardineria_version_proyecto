package com.example.Jardineria.ModuloB.Controller;
import com.example.Jardineria.ModuloAPedido.Service.TrazabilidadPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fecha")
public class TrazabilidadPedidoController {

    @Autowired
    private TrazabilidadPedidoService trazabilidadPagoService;





}
