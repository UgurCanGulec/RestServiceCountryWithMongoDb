package com.gulecugurcan.restservice_country.repository;

import com.gulecugurcan.restservice_country.model.Country;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends MongoRepository<Country,String> {

    public Country getCountryByName(String name);

}
