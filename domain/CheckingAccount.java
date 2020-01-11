package com.mybank.domain;

public class CheckingAccount extends Account {
    private double overdraftAmount;
    public  CheckingAccount(double initBalance, double overdraftAmount) {
        balance = initBalance;
        this.overdraftAmount = overdraftAmount;
    }
    public CheckingAccount(double initBalance) {
        this(initBalance, 0);
    }

    @Override
    public boolean withdraw(double amt) {
        if (amt <= balance + overdraftAmount) {
            balance -= amt;
            return true;
        }
        return false;
    }
}