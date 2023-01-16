package com.example.hybernateexample.hybernateexample.inventory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "/api/inventory", produces = {"application/json","text/xml"})
public class InventoryController {

    @Autowired
    InventoryRepository inventoryRepository;
    @GetMapping(path = "/{id}")
    public List<Inventory> getInventoryById(@PathVariable("id") Integer id){
        return inventoryRepository.findAllById(new ArrayList<>(Arrays.asList(id)));
    }

}
