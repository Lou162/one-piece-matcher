package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FruitDto {
    private String id;
    private String nomJaponais;
    private String nomFrancais;
    private String detenteur;
    private String effet;

}
