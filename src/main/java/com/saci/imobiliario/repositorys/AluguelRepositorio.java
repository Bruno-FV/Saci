package com.saci.imobiliario.repositorys;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

import com.saci.imobiliario.models.Aluguel;

public interface AluguelRepositorio extends JpaRepository<Aluguel, UUID> {
    
}
