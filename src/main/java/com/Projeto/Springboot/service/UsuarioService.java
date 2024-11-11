package com.Projeto.Springboot.service;

import com.Projeto.Springboot.model.Usuario;
import com.Projeto.Springboot.repository.UsuarioRepository;
import com.Projeto.Springboot.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;
    //lista os Usuarios
    public List<Usuario> findAll(){return usuarioRepository.findAll();}
    ///exclui Usuario
    public void delete(Integer id) {
        usuarioRepository.deleteById(id);
    }
    ///salva Usuario
    public void save(Usuario usuario) {
        usuarioRepository.save(usuario);  // Salva o usuário no banco de dados
    }

    }

