package com.example.hybernateexample.hybernateexample.language;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Language {

    @Id
    private int language_id;

    private String name;

    public Language(){
        super();
    }

    public Language(int language_id, String name) {
        this.language_id = language_id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(int language_id) {
        this.language_id = language_id;
    }

    @Override
    public String toString() {
        return "Language{" +
                "language_id=" + language_id +
                ", name='" + name + '\'' +
                '}';
    }
}
