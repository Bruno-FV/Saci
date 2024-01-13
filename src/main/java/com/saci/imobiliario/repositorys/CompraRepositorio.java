package com.saci.imobiliario.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

import com.saci.imobiliario.models.Compra;

public interface CompraRepositorio extends JpaRepository<Compra, UUID> {
    
}
