package com.hpe.hpe.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "person_type", discriminatorType = DiscriminatorType.STRING)
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_person;

    private String id_type;

    private String person_name;

    private String person_lastname;

    private String person_email;

    private String person_phone_number;

    private String person_address;

    private String person_type;

}
