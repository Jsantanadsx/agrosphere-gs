package br.com.fiap.agrosphere.service;

import br.com.fiap.agrosphere.dto.PesquisadorResponseDTO;
import br.com.fiap.agrosphere.entity.Pesquisador;
import br.com.fiap.agrosphere.repository.PesquisadorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PesquisadorService {

    private final PesquisadorRepository repository;

    public List<PesquisadorResponseDTO> listar() {

        return repository.findAll()
                .stream()
                .map(this::converterParaDTO)
                .toList();
    }

    private PesquisadorResponseDTO converterParaDTO(
            Pesquisador pesquisador) {

        return new PesquisadorResponseDTO(
                pesquisador.getId(),
                pesquisador.getNome(),
                pesquisador.getEmail(),
                pesquisador.getEspecialidade(),
                pesquisador.getInstituicao(),
                pesquisador.getDataCadastro()
        );
    }
}