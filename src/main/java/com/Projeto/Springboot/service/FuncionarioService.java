package com.Projeto.Springboot.service;

import com.Projeto.Springboot.model.Funcionario;
import com.Projeto.Springboot.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository funcionarioRepository;
    //lista todos os funcionarios;
    public List<Funcionario> findAll(){return funcionarioRepository.findAll();}
    ///busca Funcionario por id;
    public Optional<Funcionario> findOne(Integer id) {
        return funcionarioRepository.findById(id);
    }
    ///salva ou edita Funcionario
    public Funcionario save(Funcionario funcionario) {
        return funcionarioRepository.saveAndFlush(funcionario);
    }
    ///exclui Funcionario
    public void delete(Integer id) {
        funcionarioRepository.deleteById(id);
    }

}

