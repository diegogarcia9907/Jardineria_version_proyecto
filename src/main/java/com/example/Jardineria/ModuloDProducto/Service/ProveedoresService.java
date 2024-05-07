package com.example.Jardineria.ModuloDProducto.Service;



import com.example.Jardineria.ModuloDProducto.Entity.Proveedores;
import com.example.Jardineria.ModuloDProducto.Repository.ProveedoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProveedoresService {

    @Autowired
    ProveedoresRepository proveedoresRepository;

    public List<Proveedores> getProveedores(){
        return  proveedoresRepository.findAll();
    }

    public Optional<Proveedores> getProveedor(String codigoProveedor){
        return proveedoresRepository.findById(codigoProveedor);
    }

    public void saveOrUpdate(Proveedores codigoProveedor){
        proveedoresRepository.save(codigoProveedor);
    }


    public void delete(String codigoProveedor){
        proveedoresRepository.deleteById(codigoProveedor);
    }

}

