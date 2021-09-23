package com.jonydelivery.domain.repository;

import com.jonydelivery.domain.application.DefaultRepository;
import com.jonydelivery.domain.model.Cliente;

import java.util.List;

public interface ClienteRepository extends DefaultRepository<Cliente> {

    List<Cliente> findByNome(String nome);
    List<Cliente> findByNomeContaining(String nome);

}
