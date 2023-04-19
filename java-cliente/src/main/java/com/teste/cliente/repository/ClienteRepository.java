package com.teste.cliente.repository;

import com.teste.cliente.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Boolean existsByDocument(String document);

}
