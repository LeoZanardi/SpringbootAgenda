package com.Projeto.Springboot.repository;

import com.Projeto.Springboot.model.TipoAcesso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface TipoAcessoRepository extends JpaRepository<TipoAcesso,Integer> {
}
