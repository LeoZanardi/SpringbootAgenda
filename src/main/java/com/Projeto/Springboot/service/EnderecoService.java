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
    //lista os enderecos
    public List<Endereco> findAll(){return enderecoRepository.findAll();}
    ///salva ou edita Endereco
    public Endereco save(Endereco endereco) {
        return enderecoRepository.saveAndFlush(endereco);
    }
    ///exclui Endereco
    public void delete(Integer id) {
        enderecoRepository.deleteById(id);
    }
}
