package com.aula.jpa.services;

import com.aula.jpa.dto.CategoriaDTO;
import com.aula.jpa.dto.ProdutoDTO;
import com.aula.jpa.entities.Categoria;
import com.aula.jpa.entities.Produto;
import com.aula.jpa.repositories.CategoriaRepository;
import com.aula.jpa.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    public ProdutoDTO insert(ProdutoDTO produtoDTO) {

        Produto produto = new Produto();

        produto.setNome(produtoDTO.getNome());
        produto.setPreco(produtoDTO.getPreco());

        // nesse modelo o nome da categoria fica null
//        for (CategoriaDTO categoriaDTO : produtoDTO.getCategorias()) {
//            Categoria categoria = new Categoria();
//            categoria.setId(categoriaDTO.getId());
//            produto.getCategorias().add(categoria);
//        }

        for (CategoriaDTO categoriaDTO : produtoDTO.getCategorias()) {
            Categoria categoria = categoriaRepository.getReferenceById(categoriaDTO.getId());
            produto.getCategorias().add(categoria);
        }

        produto = produtoRepository.save(produto);

        return new ProdutoDTO(produto);
    }
}
