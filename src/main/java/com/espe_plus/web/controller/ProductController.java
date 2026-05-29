package com.espe_plus.web.controller;

import com.espe_plus.domain.service.EcoAIService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productos")
public class ProductController {

    private final EcoAIService ecoAIService;

    public ProductController(EcoAIService ecoAIService) {
        this.ecoAIService = ecoAIService;
    }

    @GetMapping("/slogan/{nombre}")
    public String getSlogan(@PathVariable String nombre) {
        return ecoAIService.generateSlogan(nombre);
    }
}
