package com.example.project.controller;


import com.example.project.entity.Pokedex;
import com.example.project.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PokemonController {

    @Autowired
    private PokemonService service;

    @GetMapping
    public Pokedex testePokedex(){
        return service.buscarPokedex();
    }
}
