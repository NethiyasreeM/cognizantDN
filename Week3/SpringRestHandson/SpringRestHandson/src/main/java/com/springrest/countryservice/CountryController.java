package com.springrest.countryservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    private final CountryService service = new CountryService();

    @GetMapping("/country")
    public Country getCountry() {
        return service.getCountry();
    }
}