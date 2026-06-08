package br.com.fiap.agrosphere.controller;

import br.com.fiap.agrosphere.dto.CondicaoClimaticaResponseDTO;
import br.com.fiap.agrosphere.service.CondicaoClimaticaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/condicoes-climaticas")
@RequiredArgsConstructor
public class CondicaoClimaticaController {

    private final CondicaoClimaticaService service;

    @GetMapping
    public List<CondicaoClimaticaResponseDTO> listar() {
        return service.listar();
    }
}