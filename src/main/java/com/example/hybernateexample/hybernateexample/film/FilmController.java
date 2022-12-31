package com.example.hybernateexample.hybernateexample.film;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "/api/films", produces = {"application/json","text/xml"})
public class FilmController {

    @Autowired
    FilmRepository filmRepository;

    @GetMapping(path = "/{id}")
    public List<Film> getFilm(@PathVariable("id") Integer id){
        return filmRepository.findAllById(new ArrayList<>(Arrays.asList(id)));
    }
}
