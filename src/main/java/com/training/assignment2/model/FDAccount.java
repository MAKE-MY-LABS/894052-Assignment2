package com.training.assignment2.model;

import java.time.LocalDate;

/*
 * Create a sub class FDAccount which extends Account class with the following fields:
 * maturityDate as LocalDate
 * interestRate as double
 * and create below methods
 * getTenure - to return the tenure of the FD in months
 * getMaturityAmount - to return the  maturity amount of the FD
 */
public class FDAccount extends Account {
    private LocalDate maturityDate;
    private double interestRate;

    public FDAccount(int accountNumber, double balance, LocalDate maturityDate, double interestRate) {
        super(accountNumber, balance);
        this.maturityDate = maturityDate;
        this.interestRate = interestRate;
    }
    // constructor with all paramter with transactions
    public FDAccount(int accountNumber, double balance, LocalDate maturityDate, double interestRate, java.util.List<Transaction> transactions) {
        super(accountNumber, balance);
        this.maturityDate = maturityDate;
        this.interestRate = interestRate;
        this.setTransactions(transactions);
    }

    public LocalDate getMaturityDate() {
        return this.maturityDate;
    }

    public double getInterestRate() {
        return this.interestRate;
    }

    
    public int getTenure() {
        return java.time.Period.between(LocalDate.now(), this.maturityDate).getMonths();
    }

    public double getMaturityAmount() {
        return this.getBalance() + (this.getBalance() * this.interestRate * this.getTenure() / 12);
    }

    public String getAccountDetails() {
        return "Account Number: " + this.getAccountNumber() + ", Balance: " + this.getBalance() + ", Maturity Date: "
                + this.getMaturityDate() + ", Interest Rate: " + this.getInterestRate() + ", Opening Date: "
                + this.getOpeningDate();
    }
    //toString
    public String toString() {
        return "Account Number: " + this.getAccountNumber() + ", Balance: " + this.getBalance() + ", Maturity Date: "
                + this.getMaturityDate() + ", Interest Rate: " + this.getInterestRate() + ", Opening Date: "
                + this.getOpeningDate();
    }
}
