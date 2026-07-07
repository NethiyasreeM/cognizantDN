package com.springrest.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Spring REST Hands-on is running";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @RequestMapping(value = "/**", method = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.PATCH})
    public String fallback(HttpServletRequest request) {
        return "No mapping found for " + request.getRequestURI() + ". Try /hello, /rest-country, or /authenticate";
    }
}