package com.teste.cliente.validation;

import com.teste.cliente.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueDocumentValidator implements ConstraintValidator<UniqueDocument, String> {

    @Autowired
    private ClienteService clienteService;

    @Override
    public boolean isValid(String document, ConstraintValidatorContext constraintValidatorContext) {
        return !clienteService.existsByDocument(document);
    }

}
