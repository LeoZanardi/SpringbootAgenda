package com.Projeto.Springboot.controller;

import com.Projeto.Springboot.model.Funcionario;
import com.Projeto.Springboot.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    // Método para mostrar o formulário de cadastro de funcionário
    @GetMapping("/funcionario")
    public ModelAndView showForm() {
        ModelAndView mv = new ModelAndView("CadastrarFuncionario");
        mv.addObject("funcionario", new Funcionario());
        return mv;
    }

    // Método para salvar o funcionário
    @PostMapping("/add/funcionario")
    public String saveFuncionario(@ModelAttribute("funcionario") Funcionario funcionario) {
        funcionarioService.save(funcionario);
        return "redirect:/funcionarios";
    }


}
