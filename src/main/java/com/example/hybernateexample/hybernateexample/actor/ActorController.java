package com.example.hybernateexample.hybernateexample.actor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "/api/actors", produces = {"application/json", "text/xml"})
public class ActorController {

    @Autowired
    ActorRepository actorRepository;

    @GetMapping(path = "/{id}")
    public List<Actor> getActorById(@PathVariable("id") Integer id){
        System.out.println("||||||");
        System.out.println("|-|_");
        return actorRepository.findAllById(new ArrayList<>(Arrays.asList(id)));
    }

    @PostMapping
    public Actor addActor(@RequestBody Actor newActor){
        System.out.println("--");
        System.out.println();
        return actorRepository.save(newActor);
    }


}
