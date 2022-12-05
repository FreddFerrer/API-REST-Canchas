package com.freddy.APIrest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class ReservasController {

    @GetMapping
    public String prueba(){
        return "funciona?";
    }
}
