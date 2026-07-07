package com.springrest.jwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.springrest.jwt.model.JwtRequest;
import com.springrest.jwt.model.JwtResponse;
import com.springrest.jwt.service.JwtService;

@RestController
public class JwtController {

    @Autowired
    private JwtService jwtService;

    @GetMapping("/authenticate")
    public String authenticateInfo() {
        return "Use POST /authenticate with the username/password stored in the database (default: admin/admin).";
    }

    @PostMapping("/authenticate")
    public JwtResponse authenticate(@RequestBody JwtRequest request) {
        try {
            String token = jwtService.authenticate(
                    request.getUsername(),
                    request.getPassword());

            return new JwtResponse(token);
        } catch (IllegalArgumentException ex) {
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, ex.getMessage());
        }
    }
}