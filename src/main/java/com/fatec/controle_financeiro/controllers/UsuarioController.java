package com.fatec.controle_financeiro.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.controle_financeiro.entities.User;

@RestController
@RequestMapping("/api/usuario") //endereço que o springboot utiliza para encontrar a classe
public class UsuarioController {
    //metodos são o equivalentes a end points
    @PostMapping("/create-user")
     public String createUser(@RequestBody User user) { 
        //New User user();
         return "Bem vindo, " + user.getNome() + " você tem " + user.getIdade() + " anos.";
     }
}
