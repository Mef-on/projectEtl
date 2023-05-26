package com.example.model.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "car_id")
    private Long Id;

    private String brand;
    private String model;
    private String vin;

    @ManyToMany(mappedBy = "cars")
    private List<User> users;
}
