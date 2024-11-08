package com.Projeto.Springboot.controller;

import com.Projeto.Springboot.model.Servico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.Projeto.Springboot.service.ServicoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ServicoController {
	
	@Autowired
	private ServicoService servicoService;

	@GetMapping("/add/servicos")
	public ModelAndView add(Servico post) {
		
		ModelAndView mv = new ModelAndView("/CadastrarServicos");
		mv.addObject("servico", post);
		
		return mv;
	}	
}
