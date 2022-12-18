package com.example.hybernateexample.hybernateexample.actor;

import com.example.hybernateexample.hybernateexample.actor.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Actor, Integer> {

}
