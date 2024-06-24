package com.immanuel.app.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "passenger")
public class Passenger {

    @Id
    @SequenceGenerator(name = "passenger_sequence", sequenceName = "passenger_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "passenger_sequence")
    private Long passengerId;

    private String firstName;
    private String lastName;
    private String password;
    private String bookingDate;
    private String destination;
    private double fare;

}
