package com.microservices.loan;

public class Loan {

    private int loanId;
    private String type;
    private double amount;

    public Loan() {
    }

    public Loan(int loanId, String type, double amount) {
        this.loanId = loanId;
        this.type = type;
        this.amount = amount;
    }

    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}