package com.springrest.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.rest.model.RestCountry;
import com.springrest.rest.service.RestCountryService;

@RestController
public class RestCountryController {

    @Autowired
    private RestCountryService restCountryService;

    @GetMapping("/rest-country")
    public RestCountry getCountry() {
        return restCountryService.getCountry();
    }

    @GetMapping("/rest-country/{code}")
    public RestCountry getCountry(@PathVariable String code) {
        return restCountryService.getCountry(code);
    }
}