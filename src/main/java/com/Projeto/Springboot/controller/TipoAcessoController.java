package com.Projeto.Springboot.controller;

import com.Projeto.Springboot.service.TipoAcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import com.Projeto.Springboot.model.TipoAcesso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TipoAcessoController {
	
	@Autowired
	private TipoAcessoService tipoAcessoService;

	@GetMapping("/add/acesso")
	public ModelAndView add(TipoAcesso post) {
		
		ModelAndView mv = new ModelAndView("/TipoAcesso");
		mv.addObject("tipoAcesso", post);
		
		return mv;
	}	
}
