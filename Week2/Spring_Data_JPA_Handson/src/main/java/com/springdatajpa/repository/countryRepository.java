package com.springdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springdatajpa.entity.Country;

public interface CountryRepository extends JpaRepository<Country, String> {

}
