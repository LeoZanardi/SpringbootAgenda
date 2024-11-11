package com.Projeto.Springboot.service;

import com.Projeto.Springboot.model.Cliente;
import com.Projeto.Springboot.model.Endereco;
import com.Projeto.Springboot.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {
    @Autowired
    private EnderecoRepository enderecoRepository;

    // Lista os endereços
    public List<Endereco> findAll() {
        return enderecoRepository.findAll();
    }

    // Salva ou edita o Endereco
    public Endereco save(Endereco endereco) {
        return enderecoRepository.saveAndFlush(endereco);
    }

    // Exclui Endereco
    public void delete(Integer id) {
        enderecoRepository.deleteById(id);
    }
}
