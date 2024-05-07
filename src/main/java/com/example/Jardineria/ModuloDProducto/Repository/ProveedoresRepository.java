package com.example.Jardineria.ModuloDProducto.Repository;

import com.example.Jardineria.ModuloDProducto.Entity.Proveedores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProveedoresRepository extends JpaRepository<Proveedores, String> {
    List<Proveedores> findByNombreProveedor(String nombre);

    @Query(value = "SELECT MAX(p.codigoProveedor) FROM Proveedores p")
    String obtenerUltimoCodigoProveedor();
}
