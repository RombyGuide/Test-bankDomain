package com.mybank.domain;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Bank bank = Bank.fabBank();

        Customer customer1 = new Customer("John", " Doe");
        Customer customer2 = new Customer("Jane", " Doe");

        SavingsAccount joneSavings = new SavingsAccount(1000, 7);
        CheckingAccount johnAccount = new CheckingAccount(5000, 1000);
        CheckingAccount janeAccount = new CheckingAccount(500, 100);

        customer1.addAccount(joneSavings);
        customer1.addAccount(johnAccount);
        customer2.addAccount(janeAccount);

        Bank.addCustomer(customer1);
        Bank.addCustomer(customer2);

        System.out.println(Bank.getCustomer(0) + "\n");

        Objects.requireNonNull(Bank.getCustomer(0)).getAccount(0).deposit(2000);
        try {
            Objects.requireNonNull(Bank.getCustomer(0)).getAccount(1).withdraw(7500);
        } catch (OverdraftException ex) {
            System.out.println(ex.getMessage() + ": $" + ex.getDeficit() + "!\n");
        } catch (Exception e) {
            System.out.println("Something went wrong" + e.getMessage());
        }
        ((SavingsAccount) Objects.requireNonNull(Bank.getCustomer(0)).getAccount(0)).addInterestRate();

//        print(bank);
    }

    private static void print(Bank bank) {
        System.out.println(Objects.requireNonNull(Bank.getCustomer(0)).getAccount(0).getBalance());
        System.out.println(Objects.requireNonNull(Bank.getCustomer(0)).getAccount(1).getBalance() + "\n");

          System.out.println(Bank.getCustomer(1));
    }
}
