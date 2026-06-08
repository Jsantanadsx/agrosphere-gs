package br.com.fiap.agrosphere.controller;

import br.com.fiap.agrosphere.dto.AlertaResponseDTO;
import br.com.fiap.agrosphere.service.AlertaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alertas")
@RequiredArgsConstructor
public class AlertaController {

    private final AlertaService service;

    @GetMapping
    public List<AlertaResponseDTO> listar() {
        return service.listar();
    }
}