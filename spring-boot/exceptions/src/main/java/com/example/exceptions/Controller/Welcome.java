package com.example.exceptions.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
    @GetMapping("/")
    public String welcome() {
        return "Bem-Vindo!";
    }

    @GetMapping("/dev")
    public String dev() {
        return "Hugor";
    }
}