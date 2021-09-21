package com.jonydelivery.api.controller;

import com.jonydelivery.domain.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@RestController
public class ClienteController {

    @PersistenceContext
    private EntityManager em;

    @GetMapping("/clientes")
    public List<Cliente> listar(){
        return em.createQuery("FROM Cliente", Cliente.class).getResultList();
    }
}
