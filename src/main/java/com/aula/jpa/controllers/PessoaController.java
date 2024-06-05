package com.aula.jpa.controllers;

import com.aula.jpa.dto.PessoaDTO;
import com.aula.jpa.dto.PessoaDepartamentoDTO;
import com.aula.jpa.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @PostMapping(value = "/modelo1")
    public ResponseEntity<PessoaDepartamentoDTO> adicionar(@RequestBody PessoaDepartamentoDTO pessoaDepartamentoDTO) {
        pessoaDepartamentoDTO = pessoaService.insert(pessoaDepartamentoDTO);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(pessoaDepartamentoDTO.getId()).toUri();

        return ResponseEntity.created(uri).body(pessoaDepartamentoDTO);
    }

    @PostMapping(value = "/modelo2")
    public ResponseEntity<PessoaDTO> adicionar(@RequestBody PessoaDTO pessoaDTO) {
        pessoaDTO = pessoaService.insert(pessoaDTO);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(pessoaDTO.getId()).toUri();

        return ResponseEntity.created(uri).body(pessoaDTO);
    }
}
