package com.example.hybernateexample.hybernateexample.actor;

import com.example.hybernateexample.hybernateexample.film.Film;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Actor {
    @Id
    private int actor_id;
    private String first_name;
    private String last_name;
    @ManyToMany
    @JoinTable(name="film_actor",joinColumns = { @JoinColumn(name = "actor_id") },
            inverseJoinColumns = { @JoinColumn(name = "film_id") })
    @JsonManagedReference
    private Set<Film> films = new HashSet<Film>();

    public Actor(int actor_id, String first_name, String last_name, Set<Film> films) {
        this.actor_id = actor_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.films = films;
    }

    public Actor() {
        super();
    }

    public int getActor_id() {
        return actor_id;
    }

    public void setActor_id(int actor_id) {
        this.actor_id = actor_id;
    }

    public Set<Film> getFilms() {
        return films;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {

        this.last_name = last_name;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "actor_id=" + actor_id +
                ", first_name='" + first_name + '\'' +
//                ", films=" + films +
                '}';
    }
}
