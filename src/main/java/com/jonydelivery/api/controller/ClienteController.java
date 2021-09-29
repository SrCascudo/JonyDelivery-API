package com.jonydelivery.api.controller;

import com.jonydelivery.domain.model.Cliente;
import com.jonydelivery.domain.repository.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private ClienteRepository repository;

    @GetMapping
    public List<Cliente> listar(){
        var list = repository.findAll();
        if (list != null && !list.isEmpty())
            return list;

        var cliente = new Cliente();
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
