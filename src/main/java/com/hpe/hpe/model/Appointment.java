package com.hpe.hpe.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int appointment_id;

    private Date appointment_date_time;

    private int appointment_place_id;

    @OneToOne
    private Doctor doctor_id;

    private Double appointment_cost;

}
