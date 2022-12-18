package com.example.hybernateexample.hybernateexample;

import com.example.hybernateexample.hybernateexample.actor.Actor;
import com.example.hybernateexample.hybernateexample.actor.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class HybernateexampleApplication {

	@Autowired
	ActorRepository actorRepository;

	public static void main(String[] args) {
		SpringApplication.run(HybernateexampleApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ActorRepository actorRepository1){
		return  args -> {
			List<Actor> l1 = actorRepository1.findAll();
			System.out.println(l1.get(0).toString());
		};
	}
}
