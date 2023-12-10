package com.hpe.hpe.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@DiscriminatorValue("PLACE_PERSONAL")
@Entity
@Data
public class PlacePersonal extends Person{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int place_personal_id;

    @OneToOne
    private Person person;

    @OneToOne
    private HiPlace place_personal_workplace;

}
