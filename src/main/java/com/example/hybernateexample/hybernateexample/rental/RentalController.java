package com.example.hybernateexample.hybernateexample.rental;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "/api/rentals", produces = {"application/json","text/xml"})
public class RentalController {

    @Autowired
    RentalRepository rentalRepository;

    @GetMapping(path = "/{id}")
    public List<Rental> getRentalById(@PathVariable(name = "id") Integer id){
        return rentalRepository.findAllById(new ArrayList<>(Arrays.asList(id)));
    }
}
