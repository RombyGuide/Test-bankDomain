package com.mybank.domain;

public class Account {
    double balance;

    protected Account(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }
    Account() {
        this.balance = 0;
    }
    public void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
        }
    }
    public boolean withdraw(double amt) throws Exception {
        if (amt < 0) {
            balance -= amt;
            return true;
        } return false;
    }
    public double getBalance() {
        return balance;
    }
}
