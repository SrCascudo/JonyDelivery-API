package com.jonydelivery.api.controller;

import com.jonydelivery.domain.model.Cliente;
import com.jonydelivery.domain.repository.ClienteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private ClienteRepository repository;

    public ClienteController(ClienteRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Cliente> listar(){
        List<Cliente> list = repository.findAll();
        if (!list.isEmpty())
            return list;

        Cliente cliente = new Cliente();
        cliente.setId(1L);
        cliente.setNome("John Helder C. Alves");
        cliente.setEmail("john@gmail.com");
        cliente.setTelefone("63992868489");
        cliente.setDtcadastro(new Date());
        cliente.setDtalteracao(new Date());
        cliente.setRegistro(0);
        return Collections.singletonList(cliente);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscar(@PathVariable Long id){
        return repository.findById(id).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente inserir(@RequestBody Cliente cliente){
        return repository.save(cliente);
    }

}
