package com.Projeto.Springboot.service;

import com.Projeto.Springboot.model.Agenda;
import com.Projeto.Springboot.repository.AgendaRepository;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgendaService {
    @Autowired
    private AgendaRepository agendaRepository;
    //lista tudo
    public List<Agenda> findAll() {
        return agendaRepository.findAll();
    }

    ///salva ou edita
    public Agenda save(Agenda agenda) {
        return agendaRepository.saveAndFlush(agenda);
    }

}

