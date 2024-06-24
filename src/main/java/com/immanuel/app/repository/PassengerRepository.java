package com.immanuel.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.immanuel.app.entities.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
