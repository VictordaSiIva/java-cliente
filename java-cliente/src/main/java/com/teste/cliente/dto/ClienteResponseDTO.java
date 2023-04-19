package com.teste.cliente.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.teste.cliente.model.Cliente;
import lombok.Value;

import java.time.LocalDate;

@JsonPropertyOrder({"id", "nome", "tipo", "document", "ie", "createdTime", "active"})
@Value
public class ClienteResponseDTO {
    private Long id;
    private String nome;
    private String tipo;
    private String document;
    private String ie;
    private LocalDate createdTime;
    private Boolean active;
    public static ClienteResponseDTO toDTO(Cliente cliente) {
        return new ClienteResponseDTO(cliente.getId(), cliente.getNome(), cliente.getTipo(), cliente.getDocument(), cliente.getIe(), cliente.getCreatedTime(), cliente.getActive());
    }

}
