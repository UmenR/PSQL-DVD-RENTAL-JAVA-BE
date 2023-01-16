package com.example.hybernateexample.hybernateexample.inventory;

import com.example.hybernateexample.hybernateexample.film.Film;

import javax.persistence.*;

@Entity
public class Inventory {
    @Id
    @Column(name = "inventory_id")
    private int id;

    @ManyToOne
    private Film film;

    private int store_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public int getStore_id() {
        return store_id;
    }

    public void setStore_id(int store_id) {
        this.store_id = store_id;
    }
}
