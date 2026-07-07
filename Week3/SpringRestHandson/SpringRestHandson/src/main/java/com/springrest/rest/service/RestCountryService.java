package com.springrest.rest.service;

import org.springframework.stereotype.Service;

import com.springrest.rest.model.RestCountry;

@Service
public class RestCountryService {

    public RestCountry getCountry() {
        return new RestCountry("IN", "India");
    }

    public RestCountry getCountry(String code) {

        if (code.equalsIgnoreCase("IN")) {
            return new RestCountry("IN", "India");
        }

        if (code.equalsIgnoreCase("US")) {
            return new RestCountry("US", "United States");
        }

        if (code.equalsIgnoreCase("JP")) {
            return new RestCountry("JP", "Japan");
        }

        return new RestCountry("NA", "Country Not Found");
    }
}