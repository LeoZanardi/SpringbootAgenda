package com.Projeto.Springboot.repository;

import com.Projeto.Springboot.model.Servico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicoRepository extends JpaRepository<Servico,Integer> { }
