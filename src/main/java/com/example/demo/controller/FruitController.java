package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.DetenteurRequest;
import com.example.demo.dto.FruitDto;
import com.example.demo.dto.NomRequest;
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

    @PostMapping("/detenteur")
    public FruitDto getFruitByDetenteur(@RequestBody DetenteurRequest request) {
        return fruitService.getFruitWithCharacterName(request.getDetenteur());
    }

    @PostMapping("/fruit/frname")
    public FruitDto getFruitByFrName(@RequestBody NomRequest request) {
        System.out.println(request.getNomFrancais());
        return fruitService.getFruitWithFrName(request.getNomFrancais());
    }
}