package br.com.fiap.agrosphere.service;

import br.com.fiap.agrosphere.dto.ExperimentoResponseDTO;
import br.com.fiap.agrosphere.entity.Experimento;
import br.com.fiap.agrosphere.repository.ExperimentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExperimentoService {

    private final ExperimentoRepository repository;

    public List<ExperimentoResponseDTO> listar() {

        return repository.findAll()
                .stream()
                .map(this::converterParaDTO)
                .toList();
    }

    private ExperimentoResponseDTO converterParaDTO(
            Experimento experimento) {

        return new ExperimentoResponseDTO(
                experimento.getId(),
                experimento.getMissao().getNomeMissao(),
                experimento.getPlantio()
                        .getCultura()
                        .getNomeCultura(),
                experimento.getDescricao(),
                experimento.getResultado(),
                experimento.getNivelSucesso()
        );
    }
}