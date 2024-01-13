package com.saci.imobiliario.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saci.imobiliario.dtos.CadastroAlugueCompralDto;
import com.saci.imobiliario.models.Aluguel;
import com.saci.imobiliario.repositorys.AluguelRepositorio;

import jakarta.validation.Valid;


@RestController
public class CadastroAluguelController {
    final AluguelRepositorio aluguelRepositorio;
    
    CadastroAluguelController( AluguelRepositorio aluguelRepositorio){
        this.aluguelRepositorio = aluguelRepositorio;
    }
    
    @PostMapping("/cadastroAluguel")
    public ResponseEntity<String> saveAluguel(@ModelAttribute @Valid CadastroAlugueCompralDto cadastroAluguelDto){
        Aluguel cadastroAluguel = new Aluguel();
        BeanUtils.copyProperties(cadastroAluguelDto, cadastroAluguel);
        aluguelRepositorio.save(cadastroAluguel);

        String mensagem = "Cadastro salvo com sucesso!";
        return ResponseEntity.status(HttpStatus.OK).body(
        "<script>" +
        "   alert('" + mensagem + "');" +
        "   window.location.href = '/';" +
        "</script>"
    );

    }    
    
}
