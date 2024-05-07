package com.example.Jardineria.ModuloBCliente.Service;

import com.example.Jardineria.ModuloBCliente.Entity.Oficina;

import com.example.Jardineria.ModuloBCliente.Repository.OficinaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class OficinaService {
    @Autowired
    OficinaRepository oficinaRepository;

    public List<Oficina> getOficinas(){
        return  oficinaRepository.findAll();
    }

    public Optional<Oficina> getOficina(String codigoOficina){
        return oficinaRepository.findById(codigoOficina);
    }

    public void saveOrUpdate(Oficina codigoOficina){
        oficinaRepository.save(codigoOficina);
    }


    public void delete(Oficina codigoOficina) {
        oficinaRepository.delete(codigoOficina);
    }

}
