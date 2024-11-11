package com.Projeto.Springboot.service;

import com.Projeto.Springboot.model.TipoAcesso;
import com.Projeto.Springboot.repository.TipoAcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Projeto.Springboot.repository.TipoAcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoAcessoService {
    @Autowired
    private TipoAcessoRepository tipoAcessoRepository;

    // Método para listar todos os tipos de acesso
    public List<TipoAcesso> findAll() {
        return tipoAcessoRepository.findAll();
    }

    // Método para salvar ou editar o TipoAcesso
    public TipoAcesso save(TipoAcesso tipoAcesso) {
        return tipoAcessoRepository.saveAndFlush(tipoAcesso);
    }

    // Método para excluir um TipoAcesso
    public void delete(Integer id) {
        tipoAcessoRepository.deleteById(id);
    }
}
