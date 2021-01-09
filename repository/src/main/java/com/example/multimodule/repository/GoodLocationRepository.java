package com.example.multimodule.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodLocationRepository extends MongoRepository<GoodLocation, Integer> {
    List<GoodLocation> findByCity(String city);
    List<GoodLocation> findByName(String name);
}
