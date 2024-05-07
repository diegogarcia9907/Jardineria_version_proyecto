package com.example.Jardineria.ModuloBCliente.Service;


import com.example.Jardineria.ModuloBCliente.Entity.Cliente;
import com.example.Jardineria.ModuloBCliente.Repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ClienteService {
    @Autowired
    ClienteRepository clienteRepository;

    public List<Cliente> getClientes(){
        return  clienteRepository.findAll();
    }

    public Optional<Cliente> getCliente(String codigoCliente){
        return clienteRepository.findById(codigoCliente);
    }

    public void saveOrUpdate(Cliente CodigoCliente){
        clienteRepository.save(CodigoCliente);
    }


    public void delete(Cliente codigoDepartamento) {
        clienteRepository.delete(codigoDepartamento);
    }

}
