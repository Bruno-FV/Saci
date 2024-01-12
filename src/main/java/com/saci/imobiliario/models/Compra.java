package com.saci.imobiliario.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_COMPRA")
public class Compra extends Administracao {
    
    private String detalhesCompra;

    public String getDetalhesCompra(){
        return this.detalhesCompra;
    }
    public void setDetalhesCompra(String detalhesCompra){
        this.detalhesCompra = detalhesCompra;
    }
}
