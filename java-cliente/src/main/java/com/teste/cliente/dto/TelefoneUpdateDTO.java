package com.teste.cliente.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.teste.cliente.model.Telefone;
import lombok.Value;

@JsonPropertyOrder({"area", "number", "cliente"})
@Value
public class TelefoneUpdateDTO {

    private String area;
    private String number;

    public Telefone toTelefoneWithDiferences(Telefone telefone) {
        if(area != null) telefone.setArea(area);
        if(number != null) telefone.setNumber(number);

        return telefone;
    }

}
