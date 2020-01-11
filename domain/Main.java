package com.mybank.domain;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Customer customer1 = new Customer("John Doe");
        Customer customer2 = new Customer("Jane Doe");

        SavingsAccount joneSavings = new SavingsAccount(1000, 7);
        CheckingAccount johnAccount = new CheckingAccount(5000, 1000);
        CheckingAccount janeAccount = new CheckingAccount(500, 100);

        customer1.addAccount(joneSavings);
        customer1.addAccount(johnAccount);
        customer2.addAccount(janeAccount);

        bank.addCustomer(customer1);
        bank.addCustomer(customer2);

        System.out.println(bank.getCustomer(0) + "\n");

        bank.getCustomer(0).getAccount(0).deposit(2000);
        bank.getCustomer(0).getAccount(1).withdraw(5500);
        ((SavingsAccount) bank.getCustomer(0).getAccount(0)).addInterestRate();

        System.out.println(bank.getCustomer(0).getAccount(0).getBalance());
        System.out.println(bank.getCustomer(0).getAccount(1).getBalance() + "\n");

        System.out.println(bank.getCustomer(1));
    }
}
