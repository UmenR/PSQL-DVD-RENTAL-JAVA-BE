package com.example.hybernateexample.hybernateexample.address;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {

    @Id
    @Column(name = "address_id")
    private int id;

    private String address;

    private String district;

    private int cityId;

    @Column(name = "postal_code")
    private String postCode;

    private String phone;


}
