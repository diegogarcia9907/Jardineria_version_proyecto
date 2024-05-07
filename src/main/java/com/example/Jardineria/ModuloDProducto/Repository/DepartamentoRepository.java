package com.example.Jardineria.ModuloDProducto.Repository;


import com.example.Jardineria.ModuloDProducto.Entity.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoRepository extends JpaRepository<Departamento, String> {
}
