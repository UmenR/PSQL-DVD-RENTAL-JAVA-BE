package com.example.hybernateexample.hybernateexample.store;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Store {

    @Id
    @Column(name = "store_id")
    private int id;

    // TODO: add staff id and address id


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
