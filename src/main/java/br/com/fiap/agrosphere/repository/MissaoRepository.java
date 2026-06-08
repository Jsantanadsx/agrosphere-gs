package br.com.fiap.agrosphere.repository;

import br.com.fiap.agrosphere.entity.Missao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissaoRepository
        extends JpaRepository<Missao, Long> {
}