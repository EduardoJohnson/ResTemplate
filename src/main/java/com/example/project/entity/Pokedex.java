package com.example.project.entity;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class    Pokedex {

    @Autowired
    public List<Pokemon> result;


    public List<Pokemon> getResult() {
        return result;
    }

    public void setResult(List<Pokemon> result) {
        this.result = result;
    }
}

