package com.teste.cliente.service;

import com.teste.cliente.repository.TelefoneRepository;
import com.teste.cliente.model.Cliente;
import com.teste.cliente.model.Telefone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TelefoneService {

    @Autowired
    private TelefoneRepository telefoneRepository;


    public Telefone save(Telefone telefone) {
        return telefoneRepository.save(telefone);
    }

    public void delete(Telefone telefone) {
        telefoneRepository.delete(telefone);
    }

    public List<Telefone> filterById(Long id) {
        Telefone t = new Telefone();
        t.setId(id);

        return telefoneRepository.findAll(Example.of(t));
    }

    public List<Telefone> filterByCliente(Cliente cliente) {
        Telefone tf = new Telefone();
        tf.setCliente(cliente);

        return telefoneRepository.findAll(Example.of(tf));
    }
}
