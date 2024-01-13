package com.saci.imobiliario.models;

import java.io.Serializable;
import java.util.UUID;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "ADMINISTRACAO")
public class Administracao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Lob
    @NonNull
    private byte[] imagem;
    @NonNull
    private String descricao;
    @NonNull
    private double valor;
    @NonNull
    private String contato;

    public UUID getId() {
        return this.id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public byte[] getImagem() {
        return this.imagem;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getContato() {
        return this.contato;
    }

    public void setContato(String contato) {
		this.contato = contato;
	}
}

    
