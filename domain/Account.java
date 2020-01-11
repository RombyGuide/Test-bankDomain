package com.mybank.domain;

public class Account {
    protected double balance;

    protected Account(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }
    public Account() {
        this.balance = 0;
    }
    public boolean deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            return true;
        }
        return false;
    }
    public boolean withdraw(double amt) {
        if (amt < 0) {
            balance -= amt;
            return true;
        }
        return false;
    }
    public double getBalance() {
        return balance;
    }
}
