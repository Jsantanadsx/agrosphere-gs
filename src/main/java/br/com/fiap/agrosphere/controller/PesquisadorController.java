package br.com.fiap.agrosphere.controller;

import br.com.fiap.agrosphere.dto.PesquisadorResponseDTO;
import br.com.fiap.agrosphere.service.PesquisadorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pesquisadores")
@RequiredArgsConstructor
public class PesquisadorController {

    private final PesquisadorService service;

    @GetMapping
    public List<PesquisadorResponseDTO> listar() {
        return service.listar();
    }
}