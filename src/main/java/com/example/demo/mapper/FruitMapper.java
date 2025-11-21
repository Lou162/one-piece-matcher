package com.example.demo.mapper;

import org.springframework.stereotype.Component;

import com.example.demo.dto.FruitDto;
import com.example.demo.model.Fruit;

@Component
public class FruitMapper {
    // Entité -> DTO
    public FruitDto toDTO(Fruit fruit) {
        if (fruit == null) return null;
        return new FruitDto(
                fruit.getId(),
                fruit.getNomJaponais(),
                fruit.getNomFrancais(),
                fruit.getDetenteur(),
                fruit.getEffet(),
                fruit.getType()
        );
    }

    // DTO -> Entité
    public Fruit toEntity(FruitDto dto) {
        if (dto == null) return null;
        return new Fruit(
                dto.getId(),
                dto.getNomJaponais(),
                dto.getNomFrancais(),
                dto.getDetenteur(),
                dto.getEffet(),
                dto.getType()
        );
    }

}
