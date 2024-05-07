package com.example.Jardineria.ModuloCPago.Service;

import com.example.Jardineria.ModuloCPago.Entity.EstadoPago;
import com.example.Jardineria.ModuloCPago.Repository.EstadoPagoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EstadoPagoService {
    @Autowired
    EstadoPagoRepository estadoPagoRepository;

    public List<EstadoPago> getEstadoPagos(){
        return  estadoPagoRepository.findAll();
    }

    public Optional<EstadoPago> getEstadoPago(String codigoEstadoPago){
        return estadoPagoRepository.findById(codigoEstadoPago);
    }

    public void saveOrUpdate(EstadoPago codigoEstadoPago){
        estadoPagoRepository.save(codigoEstadoPago);
    }


    public void delete(EstadoPago codigoEstadoPago) {
        estadoPagoRepository.delete(codigoEstadoPago);
    }

}
