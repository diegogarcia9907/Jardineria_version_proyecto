package com.example.Jardineria.ModuloBCliente.Repository;

import com.example.Jardineria.ModuloBCliente.Entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, String> {
}
