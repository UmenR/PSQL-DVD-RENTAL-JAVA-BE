package com.example.hybernateexample.hybernateexample.address;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "/api/addresses")
public class AddressController {

    @Autowired
    AddressRepository addressRepository;

    @GetMapping(path = "/{id}")
    public List<Address> getAddressById(@PathVariable(name = "id") Integer id){
        return addressRepository.findAllById(new ArrayList<>(Arrays.asList(id)));
    }

}
