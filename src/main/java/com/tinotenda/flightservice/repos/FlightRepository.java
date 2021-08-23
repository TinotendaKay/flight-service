package com.tinotenda.flightservice.repos;

import com.tinotenda.flightservice.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {
}
