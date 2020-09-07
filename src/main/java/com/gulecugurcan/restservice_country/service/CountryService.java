package com.gulecugurcan.restservice_country.service;

import com.gulecugurcan.restservice_country.model.Country;
import com.gulecugurcan.restservice_country.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;
        //to add a new country
    public Country insertCountry(String name,int population,String capital,String currency){
        return countryRepository.save(new Country(name,population,capital,currency));
    }

    //to list all documents

    public List<Country> getCountries(){
        return countryRepository.findAll();
    }
        //to retrieve a country
    public Country getCountryByName(String name) {
        return countryRepository.getCountryByName(name);
    }
        //to update a country
    public Country updateCountry(String name,int population,String capital,String currency) throws Exception  {
        Country country=countryRepository.getCountryByName(name);
        country.setPopulation(population);
        country.setCapital(capital);
        country.setCurrency(currency);
        return countryRepository.save(country);
    }
    //to delete countries
    public void deleteCountries(){
        countryRepository.deleteAll();
    }
    //to delete any spesific country
    public void deleteByNameCountry(String name) {
        Country country=countryRepository.getCountryByName(name);
        countryRepository.delete(country);
    }

}
