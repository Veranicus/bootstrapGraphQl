package com.veranicus.bootstrap.web;

import com.veranicus.bootstrap.entity.Dog;
import com.veranicus.bootstrap.service.DogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DogController {

    private final DogService dogService;


    public DogController(DogService dogService) {
        this.dogService = dogService;
    }

    @GetMapping("/{id}/breed")
    public ResponseEntity<String> getBreedByID(@PathVariable Long id) {
        String breed = dogService.retrieveDogBreedById(id);
        return new ResponseEntity<String>(breed, HttpStatus.OK);
    }

    @GetMapping("/dogs/name")
    public ResponseEntity<List<String>> getDogNames() {
        List<String> list = dogService.retrieveDogNames();
        return new ResponseEntity<List<String>>(list, HttpStatus.OK);
    }

    @GetMapping("/allDogs")
    public ResponseEntity<List<Dog>> showAllDogs() {
        return new ResponseEntity<List<Dog>>(dogService.getAllDogs(), HttpStatus.OK);
    }
}
