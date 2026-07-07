package com.microservices.loan;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

    @GetMapping("/loan")
    public Loan getLoan() {

        return new Loan(
                501,
                "Home Loan",
                750000);

    }

}