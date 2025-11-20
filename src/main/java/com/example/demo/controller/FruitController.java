package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.FruitDto;
import com.example.demo.services.FruitService;

@RestController
public class FruitController {
    private final FruitService fruitService;

    public FruitController(FruitService fruitService) {
        this.fruitService = fruitService;
    }

    @GetMapping("/fruits")
    public List<FruitDto> getAllFruits() {
        return fruitService.getAllFruits();
    }

    @GetMapping("/fruits/random")
    public FruitDto getRandomFruit() {
        return fruitService.getRandomFruit();
    }
}