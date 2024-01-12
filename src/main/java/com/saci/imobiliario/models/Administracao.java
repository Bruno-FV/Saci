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
    @NonNull
    @Lob
    private byte[] imagem;
    @NonNull
    private String descricao;
    @NonNull
    private double valor;
    @NonNull
    private String contato;
}
