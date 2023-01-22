package com.example.hybernateexample.hybernateexample.payment;

import com.example.hybernateexample.hybernateexample.customer.Customer;

import javax.persistence.*;

@Entity
public class Payment {

    @Id
    @Column(name = "payment_id")
    private int id;

    private long amount;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }
}
