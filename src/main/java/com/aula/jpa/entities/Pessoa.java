package com.aula.jpa.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_pessoa")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Double salario;

    @ManyToOne
    @JoinColumn(name = "departamento_id")
    private Departamento departamento;

    public Pessoa() {
    }

    public Pessoa(Long id, String nome, Double salario, Departamento departamento) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
