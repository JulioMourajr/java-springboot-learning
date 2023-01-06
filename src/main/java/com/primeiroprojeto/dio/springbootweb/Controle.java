package com.primeiroprojeto.dio.springbootweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controle {
    @GetMapping("/")
    public String mensagem(){
        return "Meu primeiro projeto Spring Boot Web";
    }
    
}
