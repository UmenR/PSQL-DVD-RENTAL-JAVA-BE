package com.example.hybernateexample.hybernateexample.film;

import com.example.hybernateexample.hybernateexample.actor.Actor;
import com.example.hybernateexample.hybernateexample.category.Category;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Film {

    @Id
    @Column(name = "film_id")
    private int film_id;
    private String title;

    @ManyToMany(mappedBy = "films")
    @JsonBackReference
    private Set<Actor> actors = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "film_category", joinColumns = {@JoinColumn(name = "film_id")},
            inverseJoinColumns = {@JoinColumn(name = "category_id")})
    @JsonManagedReference
    private Set<Category> categories = new HashSet<Category>();

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

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + film_id +
                ", title='" + title + '\'' +
                '}';
    }
}
