package br.com.fiap.agrosphere.controller;

import br.com.fiap.agrosphere.dto.ExperimentoResponseDTO;
import br.com.fiap.agrosphere.service.ExperimentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/experimentos")
@RequiredArgsConstructor
public class ExperimentoController {

    private final ExperimentoService service;

    @GetMapping
    public List<ExperimentoResponseDTO> listar() {
        return service.listar();
    }
}