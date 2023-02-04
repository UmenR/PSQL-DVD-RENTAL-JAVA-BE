package com.example.hybernateexample.hybernateexample.city;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class City {
    @Id
    @Column(name = "city_id")
    private int cityId;

    @Column(name = "city")
    private String CityName;

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
}
