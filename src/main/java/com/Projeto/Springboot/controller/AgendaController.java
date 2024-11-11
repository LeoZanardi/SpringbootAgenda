package com.Projeto.Springboot.controller;

import com.Projeto.Springboot.service.ClienteService;
import com.Projeto.Springboot.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AgendaController {

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private UsuarioService usuarioService;

    // Exibir a página de agendamento
    @GetMapping("/agendamento")
    public ModelAndView showAgendamentoPage() {
        ModelAndView mv = new ModelAndView("Agendamento");

        // Adicionar lista de clientes
        mv.addObject("clientes", clienteService.findAll());

        // Adicionar lista de usuários
        mv.addObject("usuarios", usuarioService.findAll());

        return mv;
    }
}
