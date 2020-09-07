package com.gulecugurcan.restservice_country.controller;

import com.gulecugurcan.restservice_country.model.Country;
import com.gulecugurcan.restservice_country.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    @Autowired
    CountryService countryService;
    // http://localhost:8080/insertCountry?name=Turkey&population=82000000&capital=Ankara&currency=TL
    @RequestMapping(value = "/insertCountry")
    public String insertCountry(@RequestParam String name,
                                @RequestParam int population,
                                @RequestParam String capital,
                                @RequestParam String currency){

        Country country=countryService.insertCountry(name,population,capital,currency);
        return country.toString();
    }
    //http://localhost:8080/getCountry?name=Turkey
    @RequestMapping(value ="/getCountry")
    public Country getCountry(@RequestParam String name){
        return countryService.getCountryByName(name);
    }

    // http://localhost:8080/getCountries
    @RequestMapping("/getCountries")
    public List<Country> getCountries(){
        return countryService.getCountries();
    }

    @RequestMapping("/updateCountry")
    public String updateCountry(@RequestParam String name,@RequestParam int population,
                                @RequestParam String capital, @RequestParam String currency) throws Exception {
        Country country=countryService.updateCountry(name, population, capital, currency);
        return country.toString();

    }
    @RequestMapping("/deleteCountry")
    public String deleteCountry(@RequestParam String name){
            countryService.deleteByNameCountry(name);
            return "Deleted "+name;
    }
    @RequestMapping("/deleteCountries")
    public String deleteCountries() {
        countryService.deleteCountries();
        return "Deleted All Documents";
    }

}
