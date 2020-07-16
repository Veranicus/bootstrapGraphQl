package com.veranicus.bootstrap.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.veranicus.bootstrap.entity.Dog;
import com.veranicus.bootstrap.exception.DogNotFoundException;
import com.veranicus.bootstrap.repository.DogRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Query implements GraphQLQueryResolver {

    private DogRepository dogRepository;


    public Query(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    public Dog findDogById(Long id) {
        Optional<Dog> optionalDog = dogRepository.findById(id);
        if (optionalDog.isPresent()) {
            return optionalDog.get();
        } else {
            throw new DogNotFoundException("Dog Not Found", id);
        }
    }

    public Iterable<Dog> findAllDogs() {
        return dogRepository.findAll();
    }
}
