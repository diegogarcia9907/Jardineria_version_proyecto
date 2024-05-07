package com.example.Jardineria.ModuloCPago.Service;

import com.example.Jardineria.ModuloCPago.Entity.Pago;

import com.example.Jardineria.ModuloCPago.Repository.PagoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PagoService {
    @Autowired
    PagoRepository pagoRepository;

    public List<Pago> getPagos(){
        return  pagoRepository.findAll();
    }

    public Optional<Pago> getPago(String codigoProducto){
        return pagoRepository.findById(codigoProducto);
    }

    public void saveOrUpdate(Pago idTransaccion){
        pagoRepository.save(idTransaccion);
    }


    public void delete(String idTransaccion){
        pagoRepository.deleteById(idTransaccion);
    }

}
