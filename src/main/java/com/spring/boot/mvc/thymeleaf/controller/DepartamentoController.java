package com.spring.boot.mvc.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping()
public class DepartamentoController {

    @GetMapping("/departamentos")
    public String cadastrar() {
        return "/departamento/cadastro";
    }

    @GetMapping("/listar")
    public String listar() {
        return "/departamento/lista";
    }

}
