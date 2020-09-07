package com.gulecugurcan.restservice_country.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Country {

    @Id
    String id;
    String name;
    int population;
    String capital;
    String currency;

    public Country(String name, int population, String capital, String currency) {
        this.name = name;
        this.population = population;
        this.capital = capital;
        this.currency = currency;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Name : "+name+" Capital : "+capital+" Currency : "+currency+" Population : "+population;
    }
}
