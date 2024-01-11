package com.saci.imobiliario.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdmController {
    @GetMapping("/Administracao")
    public String adm(){
        return "administracao";
    }
}
