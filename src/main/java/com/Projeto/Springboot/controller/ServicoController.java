package com.Projeto.Springboot.controller;

import com.Projeto.Springboot.model.Servico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.Projeto.Springboot.service.ServicoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ServicoController {

	@Autowired
	private ServicoService servicoService;

	// Método para mostrar o formulário de cadastro de serviço
	@GetMapping("/servicos")
	public ModelAndView add() {
		ModelAndView mv = new ModelAndView("CadastrarServicos");  // Nome da view do formulário
		mv.addObject("servico", new Servico());  // Passa um novo objeto Servico para o formulário
		return mv;
	}

	// Método para salvar um serviço
	@PostMapping("/add/servicos")
	public String saveServico(@ModelAttribute("servico") Servico servico) {
		servicoService.save(servico);  // Chama o serviço para salvar o serviço
		return "redirect:/servicos";  // Redireciona para a página de listagem de serviços
	}

	// Método para listar os serviços cadastrados
	@GetMapping("/list/servicos")
	public ModelAndView listarServicos() {
		ModelAndView mv = new ModelAndView("ListarServicos");  // Página para listar os serviços
		mv.addObject("servicos", servicoService.findAll());  // Passa a lista de serviços para a view
		return mv;
	}

	// Método para excluir um serviço
	@GetMapping("/delete/servico/{id}")
	public String deleteServico(@PathVariable("id") Integer id) {
		servicoService.delete(id);  // Chama o serviço para excluir o serviço pelo ID
		return "redirect:/servicos";  // Redireciona para a lista de serviços
	}
}
