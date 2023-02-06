package com.example.hybernateexample.hybernateexample.city;

import com.example.hybernateexample.hybernateexample.country.Country;

import javax.persistence.*;

@Entity
public class City {
    @Id
    @Column(name = "city_id")
    private int cityId;

    @Column(name = "city")
    private String CityName;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
