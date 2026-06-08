package br.com.fiap.agrosphere.controller;

import br.com.fiap.agrosphere.dto.SensorResponseDTO;
import br.com.fiap.agrosphere.service.SensorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sensores")
@RequiredArgsConstructor
public class SensorController {

    private final SensorService service;

    @GetMapping
    public List<SensorResponseDTO> listar() {
        return service.listar();
    }
}