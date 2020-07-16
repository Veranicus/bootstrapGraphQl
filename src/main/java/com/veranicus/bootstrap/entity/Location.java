package com.veranicus.bootstrap.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String address;


    public Location() {
    }

    public Location(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }


}
