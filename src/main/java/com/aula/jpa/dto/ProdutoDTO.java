package com.aula.jpa.dto;

import com.aula.jpa.entities.Categoria;
import com.aula.jpa.entities.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDTO {

    private Long id;
    private String nome;
    private Double preco;

    private List<CategoriaDTO> categorias = new ArrayList<>();

    public ProdutoDTO(Long id, String nome, Double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public ProdutoDTO(Produto produto) {
        id = produto.getId();
        nome = produto.getNome();
        preco = produto.getPreco();

        for (Categoria cat : produto.getCategorias() ){
            categorias.add(new CategoriaDTO(cat));
        }
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public List<CategoriaDTO> getCategorias() {
        return categorias;
    }
}
