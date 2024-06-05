package com.aula.jpa.services;

import com.aula.jpa.dto.PessoaDTO;
import com.aula.jpa.dto.PessoaDepartamentoDTO;
import com.aula.jpa.entities.Departamento;
import com.aula.jpa.entities.Pessoa;
import com.aula.jpa.repositories.DepartamentoRepository;
import com.aula.jpa.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository repository;

    @Autowired
    private DepartamentoRepository departamentoRepository;

    @Transactional
    public PessoaDepartamentoDTO insert(PessoaDepartamentoDTO dto) {

        Pessoa entity = new Pessoa();
        entity.setNome(dto.getNome());
        entity.setSalario(dto.getSalario());

        // modelo utilizando o departamentoRespository, dessa forma pega somente o ID.
        Departamento departamento = departamentoRepository.getReferenceById(dto.getDepartamento().getId());

        //Departamento dept = new Departamento();
        //dept.setId(dto.getDepartamento().getId());

        entity.setDepartamento(departamento);
        entity = repository.save(entity);

        return new PessoaDepartamentoDTO(entity);
    }

    @Transactional
    public PessoaDTO insert(PessoaDTO dto) {

        Pessoa entity = new Pessoa();
        entity.setNome(dto.getNome());
        entity.setSalario(dto.getSalario());

        // modelo utilizando o departamentoRespository, dessa forma pega somente o ID.
        //Departamento departamento = departamentoRepository.getReferenceById(dto.getDepartamento().getId());

        Departamento dept = new Departamento();
        dept.setId(dto.getDepartamentoId());

        entity.setDepartamento(dept);
        entity = repository.save(entity);

        return new PessoaDTO(entity);
    }
}
