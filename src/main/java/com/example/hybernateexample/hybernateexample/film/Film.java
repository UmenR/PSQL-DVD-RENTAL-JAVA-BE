package com.example.hybernateexample.hybernateexample.film;

import com.example.hybernateexample.hybernateexample.actor.Actor;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Film {

    @Id
    @Column(name = "film_id")
    private int film_id;
    private String title;

    @ManyToMany(mappedBy = "films")
    @JsonIgnore
    private Set<Actor> actors = new HashSet<>();

    public int getId() {
        return film_id;
    }

    public void setId(int id) {
        this.film_id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<Actor> getActors() {
        return actors;
    }

    public void setActors(Set<Actor> actors) {
        this.actors = actors;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + film_id +
                ", title='" + title + '\'' +
                '}';
    }
}
