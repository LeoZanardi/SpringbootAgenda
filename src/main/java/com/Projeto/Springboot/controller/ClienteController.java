package com.Projeto.Springboot.controller;

import com.Projeto.Springboot.model.Cliente;
import com.Projeto.Springboot.model.Endereco;
import com.Projeto.Springboot.service.ClienteService;
import com.Projeto.Springboot.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@Autowired
	private EnderecoService enderecoService;

	// Método para mostrar o formulário de cadastro de um cliente
	@GetMapping("/cliente")
	public ModelAndView add() {
		ModelAndView mv = new ModelAndView("CadastroCliente");
		mv.addObject("cliente", new Cliente());
		List<Endereco> enderecos = enderecoService.findAll();
		mv.addObject("enderecos", enderecos);
		return mv;
	}

	// Método para salvar o cliente
	@PostMapping("/add/Cliente")
	public String saveCliente(@ModelAttribute("cliente") Cliente cliente) {
		clienteService.save(cliente);
		return "redirect:/clientes";
	}

	// Método para listar todos os clientes
	@GetMapping("/clientes")
	public ModelAndView listarClientes() {
		ModelAndView mv = new ModelAndView("ListarClientes");
		mv.addObject("clientes", clienteService.findAll());
		return mv;
	}

	// Método para editar dados do cliente
	@GetMapping("/edit/Cliente/{id}")
	public ModelAndView edit(@PathVariable("id") Integer id) {
		Optional<Cliente> clienteOptional = clienteService.findOne(id);

		if (clienteOptional.isPresent()) {
			ModelAndView mv = new ModelAndView("CadastroCliente");
			mv.addObject("cliente", clienteOptional.get());
			List<Endereco> enderecos = enderecoService.findAll();
			mv.addObject("enderecos", enderecos);
			return mv;
		} else {
			return new ModelAndView("redirect:/clientes");
		}
	}

	// Método para atualizar os dados do cliente
	@PostMapping("/edit/Cliente")
	public String updateCliente(@ModelAttribute("cliente") Cliente cliente) {
		clienteService.save(cliente);
		return "redirect:/clientes";
	}

	// Método para deletar os dados do cliente
	@GetMapping("/delete/Cliente/{id}")
	public String deleteCliente(@PathVariable("id") Integer id) {
		clienteService.delete(id);
		return "redirect:/clientes";
	}
}
