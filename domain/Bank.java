package com.mybank.domain;

import java.util.ArrayList;

public class Bank {
    private static ArrayList<Customer> customers = new ArrayList<>();
    private static int numOfClients = 0;
    private static final Bank myBank = new Bank();

    private Bank() {

    }
    public static Customer getCustomer(int customerNo) {
        if (customerNo < customers.size()) {
            return customers.get(customerNo);
        }
        return null;
    }
    public static void addCustomer(Customer newCustomer) {
        customers.add(newCustomer);
        numOfClients++;
    }

    public static int getNumOfClients() {
        return numOfClients;
    }

    public static Bank fabBank() { // fabric method
        return myBank;
    }
}
