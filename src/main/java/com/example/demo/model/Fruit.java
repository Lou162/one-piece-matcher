package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "demonFruits") // le nom de ta collection MongoDB
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fruit {
    @Id
    private String id; // correspond à _id dans MongoDB

    @Field("Nom japonais")
    private String nomJaponais;
    @Field("Nom français")
    private String nomFrancais;
    @Field("Détenteur")
    private String detenteur;
    @Field("Effet")
    private String effet;
    @Field("Types")
    private String Type;

}
