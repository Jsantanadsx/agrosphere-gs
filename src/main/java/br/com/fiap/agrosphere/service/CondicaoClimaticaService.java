package br.com.fiap.agrosphere.service;

import br.com.fiap.agrosphere.dto.CondicaoClimaticaResponseDTO;
import br.com.fiap.agrosphere.entity.CondicaoClimatica;
import br.com.fiap.agrosphere.repository.CondicaoClimaticaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CondicaoClimaticaService {

    private final CondicaoClimaticaRepository repository;

    public List<CondicaoClimaticaResponseDTO> listar() {

        return repository.findAll()
                .stream()
                .map(this::converterParaDTO)
                .toList();
    }

    private CondicaoClimaticaResponseDTO converterParaDTO(
            CondicaoClimatica condicao) {

        return new CondicaoClimaticaResponseDTO(
                condicao.getId(),
                condicao.getFazenda().getNome(),
                condicao.getTemperaturaMedia(),
                condicao.getUmidade(),
                condicao.getIndiceRadiacao(),
                condicao.getIndiceSeca(),
                condicao.getVelocidadeVento(),
                condicao.getDataColeta()
        );
    }
}