package com.Projeto.Springboot.service;

import com.Projeto.Springboot.model.Agenda;
import com.Projeto.Springboot.model.Cliente;
import com.Projeto.Springboot.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
private ClienteRepository clienteRepository;
    //lista todos os clientes;
    public List<Cliente> findAll(){return clienteRepository.findAll();}
    ///busca clientes por id;
    public Optional<Cliente> findOne(Integer id) {
        return clienteRepository.findById(id);
    }
    ///salva ou edita cliente
    public Cliente save(Cliente cliente) {
        return clienteRepository.saveAndFlush(cliente);
    }
    ///exclui cliente
    public void delete(Integer id) {
        clienteRepository.deleteById(id);
    }

}
