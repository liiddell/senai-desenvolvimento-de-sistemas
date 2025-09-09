package com.senai.primeiroProjeto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class Welcome {
    @GetMapping ("/home")
    public String mensagem() {
        return "Olá, mundo!";
    }

    @GetMapping("/aluno")
    public String aluno() {
        return "Meu nome é Gabriel";
    }

    @GetMapping("/dev")
    public String dev() {
        return "Quero ser um desenvolvedor full stack!";
    }

}
