package com.example.Jardineria.ModuloBCliente.Service;

import com.example.Jardineria.ModuloBCliente.Entity.Empleado;
import com.example.Jardineria.ModuloBCliente.Repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EmpleadoService {
    @Autowired
    EmpleadoRepository empleadoRepository;

    public List<Empleado> getEmpleados(){
        return  empleadoRepository.findAll();
    }

    public Optional<Empleado> getEmpleado(String codigoEstadoPago){
        return empleadoRepository.findById(codigoEstadoPago);
    }

    public void saveOrUpdate(Empleado codigoEstadoPago){
        empleadoRepository.save(codigoEstadoPago);
    }


    public void delete(Empleado codigoEstadoPago) {
        empleadoRepository.delete(codigoEstadoPago);
    }

}
