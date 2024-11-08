package com.Projeto.Springboot.service;

import com.Projeto.Springboot.model.Endereco;
import com.Projeto.Springboot.model.Servico;
import com.Projeto.Springboot.repository.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoService {
    @Autowired
    private ServicoRepository servicoRepository;
    //lista os servicos
    public List<Servico> findAll(){return servicoRepository.findAll();}
    ///salva ou edita servicos
    public Servico save(Servico servico) {
        return servicoRepository.saveAndFlush(servico);
    }
    ///exclui servico
    public void delete(Integer id) {
        servicoRepository.deleteById(id);
    }

}
