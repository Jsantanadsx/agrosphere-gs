package br.com.fiap.agrosphere.repository;

import br.com.fiap.agrosphere.entity.Fazenda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FazendaRepository
        extends JpaRepository<Fazenda, Long> {
}