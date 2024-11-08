package com.Projeto.Springboot.repository;

import com.Projeto.Springboot.model.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendaRepository extends JpaRepository<Agenda,Integer> { }
