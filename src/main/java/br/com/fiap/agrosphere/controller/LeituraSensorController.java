package br.com.fiap.agrosphere.controller;

import br.com.fiap.agrosphere.dto.LeituraSensorResponseDTO;
import br.com.fiap.agrosphere.service.LeituraSensorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/leituras-sensor")
@RequiredArgsConstructor
public class LeituraSensorController {

    private final LeituraSensorService service;

    @GetMapping
    public List<LeituraSensorResponseDTO> listar() {
        return service.listar();
    }
}