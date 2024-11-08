package com.Projeto.Springboot.service;

import com.Projeto.Springboot.repository.TipoAcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TipoAcessoService {
    @Autowired
    private TipoAcessoRepository tipoAcessoRepository;
}
