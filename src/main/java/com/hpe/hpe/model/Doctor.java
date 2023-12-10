package com.hpe.hpe.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@DiscriminatorValue("DOCTOR")
public class Doctor extends Person{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int doctor_id;

    @OneToOne
    private HiPlace doctor_attention_place;

    private String doctor_specialization;

    @OneToOne
    private Person person;
}
