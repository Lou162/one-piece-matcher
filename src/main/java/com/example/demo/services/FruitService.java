package com.example.demo.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.dto.FruitDto;
import com.example.demo.mapper.FruitMapper;
import com.example.demo.model.Fruit;
import com.example.demo.repository.FruitRepository;

@Service
public class FruitService {

    private final FruitRepository fruitRepository;
    private final FruitMapper fruitMapper;

    public FruitService(FruitRepository fruitRepository, FruitMapper fruitMapper) {
        this.fruitRepository = fruitRepository;
        this.fruitMapper = fruitMapper;
    }

    public List<FruitDto> getAllFruits() {
        return fruitRepository.findAll()
                .stream()
                .map(fruitMapper::toDTO)
                .collect(Collectors.toList());
    }

    public FruitDto getRandomFruit() {
    Fruit randomFruit = fruitRepository.getRandomFruit();
    return fruitMapper.toDTO(randomFruit);
}
}
