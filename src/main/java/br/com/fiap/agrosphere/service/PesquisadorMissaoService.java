package br.com.fiap.agrosphere.service;

import br.com.fiap.agrosphere.dto.PesquisadorMissaoResponseDTO;
import br.com.fiap.agrosphere.entity.PesquisadorMissao;
import br.com.fiap.agrosphere.repository.PesquisadorMissaoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PesquisadorMissaoService {

    private final PesquisadorMissaoRepository repository;

    public List<PesquisadorMissaoResponseDTO> listar() {

        return repository.findAll()
                .stream()
                .map(this::converterParaDTO)
                .toList();
    }

    private PesquisadorMissaoResponseDTO converterParaDTO(
            PesquisadorMissao pm) {

        return new PesquisadorMissaoResponseDTO(
                pm.getPesquisador().getNome(),
                pm.getMissao().getNomeMissao(),
                pm.getPapel(),
                pm.getDataEntrada()
        );
    }
}