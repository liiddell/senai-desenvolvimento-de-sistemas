package com.example.servicesexceptions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @GetMapping("/")
    public String mensagem() {
        return "Bem-vindo!";
    }
}