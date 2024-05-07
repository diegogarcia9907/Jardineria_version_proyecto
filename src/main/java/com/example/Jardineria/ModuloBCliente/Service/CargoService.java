package com.example.Jardineria.ModuloBCliente.Service;

import com.example.Jardineria.ModuloBCliente.Entity.Cargo;

import com.example.Jardineria.ModuloBCliente.Repository.CargoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CargoService {
    @Autowired
    CargoRepository cargoRepository;

    public List<Cargo> getCiudades(){
        return  cargoRepository.findAll();
    }

    public Optional<Cargo> getCiudad(String codigoCargo){
        return cargoRepository.findById(codigoCargo);
    }

    public void saveOrUpdate(Cargo Cargo){
        cargoRepository.save(Cargo);
    }


    public void delete(Cargo codigoCargo) {
        cargoRepository.delete(codigoCargo);
    }

}
