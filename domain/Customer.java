package com.mybank.domain;

import java.util.ArrayList;

public class Customer {
    private ArrayList<Account> accounts;
    private final String firstName;
    private final String lastName;
    private final int customerNumber;
    private static int customerNumberBase = 1000;
    private int numOfAccounts;

    public Customer(String firstName, String lastName) {
        accounts = new ArrayList<>();
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerNumber = customerNumberBase++;
        this.numOfAccounts = 0;
    }
    public Account getAccount(int accNo) {
        if (accNo < accounts.size() && numOfAccounts != 0) {
            return accounts.get(accNo);
        }
        return null;
    }
    public void addAccount(Account acc) {
        accounts.add(acc);
        numOfAccounts++;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("Customer - " + firstName + lastName + "\nCustomer number - " + customerNumber + "\nNum of accounts - " + numOfAccounts);
        for (int i = 0; i < this.numOfAccounts; i++) {
            Account acc = getAccount(i);
            if (acc instanceof SavingsAccount) {
                s.append("\nSavings account with interest rate %").append(((SavingsAccount) acc).getInterestRate());
            } else {
                s.append("\nChecking account with overdraft $").append(((CheckingAccount) acc).getOverdraftAmount());
            }
            s.append(", balance $").append(acc.getBalance());
        }
        return s.toString();
    }
}
