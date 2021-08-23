package com.tinotenda.flightservice.controller;

import com.tinotenda.flightservice.model.Flight;
import com.tinotenda.flightservice.repos.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/flights/")
public class FlightController {

    @Autowired
    FlightRepository flightRepository;

    @GetMapping
    public List<Flight> findFlights() {
        return flightRepository.findAll();
    }
}
