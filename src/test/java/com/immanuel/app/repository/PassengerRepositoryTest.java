package com.immanuel.app.repository;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.immanuel.app.entities.Passenger;

@SpringBootTest
public class PassengerRepositoryTest {

    @Autowired
    private PassengerRepository passengerRepository;

    @Test
    public void savePassenger() {
        Passenger passenger = Passenger.builder()
        .firstName("Steven")
        .lastName("Fred")
        .password("y905ast*")
        .bookingDate(new Date().toString())
        .destination("Corsica")
        .fare(450.00)
        .build();

        passengerRepository.save(passenger);
    }

}
