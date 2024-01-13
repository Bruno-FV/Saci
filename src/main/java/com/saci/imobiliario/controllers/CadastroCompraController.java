package com.saci.imobiliario.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saci.imobiliario.dtos.CadastroAlugueCompralDto;
import com.saci.imobiliario.models.Compra;
import com.saci.imobiliario.repositorys.CompraRepositorio;

@RestController
public class CadastroCompraController {

    final CompraRepositorio compraRepositorio;
    CadastroCompraController(CompraRepositorio compraRepositorio){
        this.compraRepositorio = compraRepositorio;
    }
    @PostMapping("/cadastroCompra")
    public ResponseEntity<String> saveCompra(CadastroAlugueCompralDto cadastroAlugueCompralDto){
        Compra cadastroCompra = new Compra();
        BeanUtils.copyProperties(cadastroAlugueCompralDto, cadastroCompra);
        compraRepositorio.save(cadastroCompra);

        String mensagem = "Cadastro salvo com sucesso!";
    return ResponseEntity.status(HttpStatus.OK).body(
        "<script>" +
        "   alert('" + mensagem + "');" +
        "   window.location.href = '/';" +
        "</script>"
    );
    }
    
}
