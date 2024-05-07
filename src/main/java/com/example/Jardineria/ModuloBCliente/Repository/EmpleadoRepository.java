package com.example.Jardineria.ModuloBCliente.Repository;

import com.example.Jardineria.ModuloBCliente.Entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<Empleado, String> {
}
