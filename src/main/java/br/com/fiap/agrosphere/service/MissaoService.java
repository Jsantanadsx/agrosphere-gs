package br.com.fiap.agrosphere.service;

import br.com.fiap.agrosphere.dto.MissaoResponseDTO;
import br.com.fiap.agrosphere.entity.Missao;
import br.com.fiap.agrosphere.repository.MissaoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MissaoService {

    private final MissaoRepository repository;

    public List<MissaoResponseDTO> listar() {

        return repository.findAll()
                .stream()
                .map(this::converterParaDTO)
                .toList();
    }

    private MissaoResponseDTO converterParaDTO(
            Missao missao) {

        return new MissaoResponseDTO(
                missao.getId(),
                missao.getNomeMissao(),
                missao.getObjetivo(),
                missao.getTipoMissao(),
                missao.getDataInicio(),
                missao.getStatus()
        );
    }
}