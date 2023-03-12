package com.garofalo.medicare_simplilearn_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class ProductManufacturer {

    @Id //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //identity marker
    private int id;
    private String name;
    private String country;


    //RELATIONSHIP
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "manufacturer") //manufacturer is in the Product table (foreign key)
    private Set<Product> products;

}
