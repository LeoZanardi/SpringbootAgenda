package com.Projeto.Springboot.controller;

import com.Projeto.Springboot.model.Cliente;
import com.Projeto.Springboot.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;

	@GetMapping("/add/Cliente")
	public ModelAndView add(Cliente post) {
		
		ModelAndView mv = new ModelAndView("/CadastroCliente");
		mv.addObject("cliente", post);
		
		return mv;
	}	
}
