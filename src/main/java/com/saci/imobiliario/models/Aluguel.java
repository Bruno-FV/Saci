package com.saci.imobiliario.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_ALUGUEL")
public class Aluguel extends Administracao {
    
    private String detalhesAluguel;

    public String getDetalhesAluguel() {
        return this.detalhesAluguel;
    }

    public void setDetalhesAluguel(String detalhesAluguel) {
        this.detalhesAluguel = detalhesAluguel;
    }
   
}