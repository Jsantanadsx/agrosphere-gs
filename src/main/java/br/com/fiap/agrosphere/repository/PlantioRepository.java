package br.com.fiap.agrosphere.repository;

import br.com.fiap.agrosphere.entity.Plantio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlantioRepository
        extends JpaRepository<Plantio, Long> {
}