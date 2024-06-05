package com.aula.jpa.dto;

import com.aula.jpa.entities.Departamento;

public class DepartamentoDTO {

    private Long id;
    private String nome;

    public DepartamentoDTO(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public DepartamentoDTO(Departamento departamento) {
        id = departamento.getId();
        nome = departamento.getNome();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
