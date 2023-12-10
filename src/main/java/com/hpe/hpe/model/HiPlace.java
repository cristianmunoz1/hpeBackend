package com.hpe.hpe.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class HiPlace {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int hi_place_id;

    private String hi_place_name;

    private String hi_place_full_address;

    private String hi_place_department;

    private String hi_place_city;
}
