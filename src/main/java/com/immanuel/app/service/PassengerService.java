package com.immanuel.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.immanuel.app.entities.Passenger;
import com.immanuel.app.repository.PassengerRepository;

@Service
public class PassengerService {

    @Autowired
    private PassengerRepository passengerRepository;

    // get all the passengers
    public List<Passenger> getAllPassengers() {
        List<Passenger> list = passengerRepository.findAll();
        return list;
    }

    // get a perticular passenger based on their id
    public Passenger getPassengerById(Long id) {
        Passenger passenger = passengerRepository.findById(id).get();
        return passenger;
    }

    // delete a passenger based on their id
    public boolean deletePassenger(Long id) {
        Passenger passenger = getPassengerById(id);
        if (passenger.getPassengerId() != null) {
            passengerRepository.delete(passenger);
            return true;
        }
        return false;
    }

    public void savePassenger(Passenger passenger) {
        passengerRepository.save(passenger);
    }

}
