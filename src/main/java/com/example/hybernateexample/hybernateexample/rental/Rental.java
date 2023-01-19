package com.example.hybernateexample.hybernateexample.rental;

import com.example.hybernateexample.hybernateexample.inventory.Inventory;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Rental {

    @Id
    @Column(name = "rental_id")
    private int id;

    @DateTimeFormat(pattern = "yyyy/MM/dd")
    @Column(name = "rental_date")
    private Date date;

    @OneToOne
    @JoinColumn(name = "inventory_id")
    private Inventory inventory;

    public Rental() {
        super();
    }

    public Rental(int id, Date date, Inventory inventory) {
        this.id = id;
        this.date = date;
        this.inventory = inventory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
