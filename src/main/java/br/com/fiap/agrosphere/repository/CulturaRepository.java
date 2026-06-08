package br.com.fiap.agrosphere.repository;

import br.com.fiap.agrosphere.entity.Cultura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CulturaRepository
        extends JpaRepository<Cultura, Long> {
}