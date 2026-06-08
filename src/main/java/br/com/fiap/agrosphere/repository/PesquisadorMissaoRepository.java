package br.com.fiap.agrosphere.repository;

import br.com.fiap.agrosphere.entity.PesquisadorMissao;
import br.com.fiap.agrosphere.entity.PesquisadorMissaoId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PesquisadorMissaoRepository
        extends JpaRepository<
        PesquisadorMissao,
        PesquisadorMissaoId> {
}