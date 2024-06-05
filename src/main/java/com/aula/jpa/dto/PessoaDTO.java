package com.aula.jpa.dto;

import com.aula.jpa.entities.Pessoa;

public class PessoaDTO {
    private Long id;
    private String nome;
    private Double salario;
    private Long departamentoId;

    public PessoaDTO(Long id, String nome, Double salario, Long departamentoId) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.departamentoId = departamentoId;
    }

    public PessoaDTO(Pessoa pessoa){
        id = pessoa.getId();
        nome = pessoa.getNome();
        salario = pessoa.getSalario();
        departamentoId = pessoa.getDepartamento().getId();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }

    public Long getDepartamentoId() {
        return departamentoId;
    }
}
