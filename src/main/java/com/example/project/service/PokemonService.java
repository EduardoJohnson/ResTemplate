package com.example.project.service;

import com.example.project.entity.Pokedex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PokemonService {

    @Autowired
    public RestTemplate template;


    public Pokedex buscarPokedex(){
        return  template.getForObject("https://pokeapi.co/api/v2/pokemon?limit=10", Pokedex.class);

    }

}