package com.Projeto.Springboot.controller;

import com.Projeto.Springboot.service.TipoAcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import com.Projeto.Springboot.model.TipoAcesso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TipoAcessoController {

	@Autowired
	private TipoAcessoService tipoAcessoService;

	// Método para mostrar o formulário de cadastro de tipo de acesso
	@GetMapping("/acesso")
	public ModelAndView add() {
		ModelAndView mv = new ModelAndView("TipoAcesso");  // Nome da página de cadastro
		mv.addObject("tipoAcesso", new TipoAcesso());  // Passa um novo objeto TipoAcesso para o formulário
		return mv;
	}

	// Método para salvar um tipo de acesso
	@PostMapping("/add/acesso")
	public String saveTipoAcesso(@ModelAttribute("tipoAcesso") TipoAcesso tipoAcesso) {
		tipoAcessoService.save(tipoAcesso);  // Chama o serviço para salvar o tipo de acesso
		return "redirect:/tipos-acesso";  // Redireciona para a página de listagem de tipos de acesso
	}

}
