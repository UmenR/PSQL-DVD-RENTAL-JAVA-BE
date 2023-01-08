package com.example.hybernateexample.hybernateexample.language;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "/api/languages", produces = {"application/json", "text/xml"})
public class LanguageController {

    @Autowired
    LanguageRepository languageRepository;

    @GetMapping(path = "/{id}")
    public List<Language> getLanguageById(@PathVariable("id") Integer id){
        return languageRepository.findAllById(new ArrayList<>(Arrays.asList(id)));
    }
}
