package com.example.hybernateexample.hybernateexample.address;

import com.example.hybernateexample.hybernateexample.city.City;

import javax.persistence.*;

@Entity
public class Address {

    @Id
    @Column(name = "address_id")
    private int id;

    private String address;

    private String district;

    @Column(name = "postal_code")
    private String postCode;

    private String phone;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
