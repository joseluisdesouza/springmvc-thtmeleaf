package com.spring.boot.mvc.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/funcionario")
public class FuncionarioController {

    @GetMapping("/departamentos")
    public String cadastrar() {
        return "/funcionario/cadastro";
    }

    @GetMapping("/listar")
    public String listar() {
        return "/funcionario/lista";
    }
}
