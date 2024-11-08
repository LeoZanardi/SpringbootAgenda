package com.Projeto.Springboot.controller;

import com.Projeto.Springboot.model.Agenda;
import com.Projeto.Springboot.service.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AgendaController {
	
	@Autowired
	private AgendaService agendaService;

	@GetMapping("/add/agenda")
	public ModelAndView add(Agenda post) {
		
		ModelAndView mv = new ModelAndView("/Agendamento");
		mv.addObject("agendamento", post);
		
		return mv;
	}	
}
