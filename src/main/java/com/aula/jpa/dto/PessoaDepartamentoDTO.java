package com.aula.jpa.dto;

import com.aula.jpa.entities.Pessoa;

public class PessoaDepartamentoDTO {

    private Long id;
    private String nome;
    private Double salario;

    private DepartamentoDTO departamento;

    public PessoaDepartamentoDTO(Long id, String nome, Double salario, DepartamentoDTO departamento) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    public PessoaDepartamentoDTO(Pessoa pessoa){
        id = pessoa.getId();
        nome = pessoa.getNome();
        salario = pessoa.getSalario();
        departamento = new DepartamentoDTO(pessoa.getDepartamento());
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

    public DepartamentoDTO getDepartamento() {
        return departamento;
    }
}
