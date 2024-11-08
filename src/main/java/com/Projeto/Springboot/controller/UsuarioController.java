package com.Projeto.Springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;

import com.Projeto.Springboot.model.TipoAcesso;
import com.Projeto.Springboot.model.Usuario;
import com.Projeto.Springboot.service.ServicoService;
import com.Projeto.Springboot.service.UsuarioService;
import com.Projeto.Springboot.model.Funcionario;
import com.Projeto.Springboot.service.UsuarioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;

	@GetMapping("/add/user")
	public ModelAndView add(Usuario post) {
		
		ModelAndView mv = new ModelAndView("/CadastroUser");
		mv.addObject("usuario", post);
		
		return mv;
	}	
}
