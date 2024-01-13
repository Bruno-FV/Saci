package com.saci.imobiliario.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaginasController {
    @GetMapping("/")
    public String paginaInicial(){
        return "home";
    }
    @GetMapping("/cadastro")
    public String cadastroCorretor(){
        return "cadastroCorretor";
    }
    @GetMapping("/aluguel")
    public String cadastroAluguel(){
        return "cadastroAluguel";
    }
    @GetMapping("/compra")
    public String cadastroCompra(){
        return "cadastroCompra";
    }
}
