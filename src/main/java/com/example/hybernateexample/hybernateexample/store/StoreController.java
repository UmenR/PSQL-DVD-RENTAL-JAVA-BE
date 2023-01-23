package com.example.hybernateexample.hybernateexample.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "/api/stores/")
public class StoreController {

    @Autowired
    StoreRepository storeRepository;

    @GetMapping(path = "/{id}")
    public List<Store> getStoreById(@PathVariable(name = "id") Integer id){
        return storeRepository.findAllById(new ArrayList(Arrays.asList(id)));
    }
}
