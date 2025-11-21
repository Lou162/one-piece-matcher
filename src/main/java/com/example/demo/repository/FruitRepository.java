package com.example.demo.repository;

import com.example.demo.model.Fruit;

import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FruitRepository extends MongoRepository<Fruit, String>{
    @Aggregation("{ $sample: { size: 1 } }")
    Fruit getRandomFruit();

    Fruit findByDetenteur(String detenteur);
    Fruit findByNomFrancais(String nomFrancais);

}
