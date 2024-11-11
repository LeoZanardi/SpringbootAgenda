package com.Projeto.Springboot.controller;

import com.Projeto.Springboot.model.Endereco;
import com.Projeto.Springboot.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EnderecoController {

	@Autowired
	private EnderecoService enderecoService;

	// mostra o f/ormulário de cadastro
	@GetMapping("/endereco")
	public ModelAndView add() {
		ModelAndView mv = new ModelAndView("CadastroEndereco");
		mv.addObject("endereco", new Endereco());  // Inicializa um novo objeto Endereco
		return mv;
	}

	// salvar o endereço no banco de dados
	@PostMapping("/add/endereco")
	public String saveEndereco(@ModelAttribute("endereco") Endereco endereco) {
		enderecoService.save(endereco);  // Chama o método 'save' para salvar o endereço
		return "redirect:/enderecos";  // Redireciona para a lista de endereços após salvar
	}

	// Método para listar os endereços cadastrados
	@GetMapping("/enderecos")
	public ModelAndView listarEnderecos() {
		ModelAndView mv = new ModelAndView("ListarEnderecos");
		mv.addObject("enderecos", enderecoService.findAll());  // Usa o método 'findAll' para listar os endereços
		return mv;
	}
}
