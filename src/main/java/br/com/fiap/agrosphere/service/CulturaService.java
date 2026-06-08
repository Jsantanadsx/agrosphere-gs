package br.com.fiap.agrosphere.service;

import br.com.fiap.agrosphere.dto.CulturaResponseDTO;
import br.com.fiap.agrosphere.entity.Cultura;
import br.com.fiap.agrosphere.repository.CulturaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CulturaService {

    private final CulturaRepository repository;

    public List<CulturaResponseDTO> listar() {

        return repository.findAll()
                .stream()
                .map(this::converterParaDTO)
                .toList();
    }

    private CulturaResponseDTO converterParaDTO(Cultura cultura) {

        return new CulturaResponseDTO(
                cultura.getId(),
                cultura.getNomeCultura(),
                cultura.getCategoria(),
                cultura.getTempoMaturacao(),
                cultura.getConsumoHidrico(),
                cultura.getResistenciaCalor(),
                cultura.getResistenciaSeca()
        );
    }
}