package com.example.hybernateexample.hybernateexample.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "/api/customers", produces = {"application/json", "text/xml"})
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(path = "/{id}")
    public List<Customer> getCustomerById(@PathVariable(name = "id") Integer id){
        return customerRepository.findAllById(new ArrayList<>(Arrays.asList(id)));
    }
}
