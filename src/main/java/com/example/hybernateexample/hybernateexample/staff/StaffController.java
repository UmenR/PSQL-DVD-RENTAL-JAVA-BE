package com.example.hybernateexample.hybernateexample.staff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "/api/staff")
public class StaffController {

    @Autowired
    StaffRepository staffRepository;

    @GetMapping(path = "/{id}")
    public List<Staff> getStaffById(@PathVariable(name = "id") Integer id ){
        return staffRepository.findAllById(new ArrayList<>(Arrays.asList(id)));
    }
}
