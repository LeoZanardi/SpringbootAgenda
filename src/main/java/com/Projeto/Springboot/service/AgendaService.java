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
    //Metodo que lista todos os dados
    public List<Agenda> findAll() {
        return agendaRepository.findAll();
    }

    //Metodo que salva ou edita os dados
    public Agenda save(Agenda agenda) {
        return agendaRepository.saveAndFlush(agenda);
    }
    // Metodo que busca por Id
    public Optional<Agenda> findOne(Integer id) {
        return agendaRepository.findById(id);
    }
    // Metodo que exclui uma agenda
    public void delete(Integer id) {
        agendaRepository.deleteById(id);  // Exclui a agenda pelo ID
    }
}

