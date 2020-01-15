package com.mybank.domain;

class SavingsAccount extends Account {
    private final double interestRate;
    public SavingsAccount(double initBalance, double interestRate) {
        balance = initBalance;
        this.interestRate = interestRate;
    }
    public void addInterestRate() {
        this.balance = this.balance + this.balance * interestRate / 100;
    }

    public double getInterestRate() {
        return interestRate;
    }
}
