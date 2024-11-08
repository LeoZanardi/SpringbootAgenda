package com.Projeto.Springboot.controller;

import com.Projeto.Springboot.model.Endereco;
import com.Projeto.Springboot.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EnderecoController {
	
	@Autowired
	private EnderecoService enderecoService;
	
    @GetMapping("/add/end")
	public ModelAndView add(Endereco post) {
		
		ModelAndView mv = new ModelAndView("/CadastroEndereco");
		mv.addObject("endereco", post);
		
		return mv;
	}	
}
