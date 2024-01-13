package com.saci.imobiliario.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.UUID;




@Entity
@Table(name = "TB_CADASTRAR_CORRETOR")
public class CadastrarCorretor implements Serializable {
    private static final long serialVersionUID = 1L;

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private UUID id;
   @NotNull
   private String nomeCorretor;
   @NotNull
   private String emailCorretor;
   @NotNull
   private String senhaCorretor;
   @NotNull
   private String contatoCorretor;

   public UUID getId() {
       return this.id;
   }

   public void setId(UUID id) {
       this.id = id;
   }

   public String getNomeCorretor() {
       return this.nomeCorretor;
   }

   public void setNomeCorretor(String nomeCorretor) {
       this.nomeCorretor = nomeCorretor;
   }

   public String getEmailCorretor() {
       return this.emailCorretor;
   }

   public void setEmailCorretor(String emailCorretor) {
       this.emailCorretor = emailCorretor;
   }

   public String getSenhaCorretor() {
       return this.senhaCorretor;
   }

   public void setSenhaCorretor(String senhaCorretor) {
       this.senhaCorretor = senhaCorretor;
   }

   public String getContatoCorretor() {
       return this.contatoCorretor;
   }

   public void setContatoCorretor(String contatoCorretor) {
       this.contatoCorretor = contatoCorretor;
   }
    
}
