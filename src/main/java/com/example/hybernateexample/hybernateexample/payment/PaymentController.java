package com.example.hybernateexample.hybernateexample.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "/api/payments")
public class PaymentController {

    @Autowired
    PaymentRepository paymentRepository;

    @GetMapping(path = "/{id}")
    public List<Payment> getPaymentById(@PathVariable(name = "id") Integer id){
        return paymentRepository.findAllById(new ArrayList<>(Arrays.asList(id)));
    }

}
