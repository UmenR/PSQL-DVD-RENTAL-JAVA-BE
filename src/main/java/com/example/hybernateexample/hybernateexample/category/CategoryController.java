package com.example.hybernateexample.hybernateexample.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "api/category" ,produces = {"application/json", "text/xml"} )
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping(path = "/{id}")
    public List<Category> getCategoryById(@PathVariable("id") Integer id){
        return categoryRepository.findAllById(new ArrayList<>(Arrays.asList(id)));
    }
}
