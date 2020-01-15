package com.mybank.domain;

public class CheckingAccount extends Account {
    private final double overdraftAmount;
    public  CheckingAccount(double initBalance, double overdraftAmount) {
        balance = initBalance;
        this.overdraftAmount = overdraftAmount;
    }
    public CheckingAccount(double initBalance) {
        this(initBalance, 0);
    }

    @Override
    public boolean withdraw(double amt) throws Exception {
        if (amt <= balance + overdraftAmount) {
            balance -= amt;
            return true;
        }
        throw new OverdraftException("Error! Insufficient funds", amt - balance - overdraftAmount);
    }

    public double getOverdraftAmount() {
        return overdraftAmount;
    }
}
