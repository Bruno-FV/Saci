package com.saci.imobiliario.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saci.imobiliario.models.CadastrarCorretor;

import java.util.UUID;

@Repository
public interface SaciRepositorio extends JpaRepository<CadastrarCorretor, UUID> {
    
}
