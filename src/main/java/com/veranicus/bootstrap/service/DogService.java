package com.veranicus.bootstrap.service;

import com.veranicus.bootstrap.entity.Dog;

import java.util.List;

public interface DogService {

    List<Dog> getAllDogs();
    List<String> retrieveDogBreed();
    String retrieveDogBreedById(Long id);
    List<String> retrieveDogNames();
}
