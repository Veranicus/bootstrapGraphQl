package com.veranicus.bootstrap.service;

import com.veranicus.bootstrap.entity.Dog;
import com.veranicus.bootstrap.repository.DogRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DogServiceImpl implements DogService {

    DogRepository dogRepository;

    public DogServiceImpl(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    @Override
    public List<Dog> getAllDogs() {
        List<Dog> testDogs = new ArrayList<>();
        testDogs.add(new Dog("john", "wolf", "Mexico"));
        return (List<Dog>) dogRepository.findAll();
    }

    public List<Dog> retrieveDogs() {
        return (List<Dog>) dogRepository.findAll();
    }

    public List<String> retrieveDogBreed() {
        return (List<String>) dogRepository.findAllBreed();
    }

    public String retrieveDogBreedById(Long id) {
        Optional<String> optionalBreed = Optional.ofNullable(dogRepository.findBreedById(id));
        String breed = optionalBreed.orElseThrow(DogNotFoundException::new);
        return breed;
    }
    public List<String> retrieveDogNames() {
        return (List<String>) dogRepository.findAllName();
    }
}
