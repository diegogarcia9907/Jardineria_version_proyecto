package com.example.Jardineria.ModuloDProducto.Repository;


import com.example.Jardineria.ModuloDProducto.Entity.Ciudad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CiudadRepository extends JpaRepository<Ciudad, String> {
}
