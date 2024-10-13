package com.demo;

public class CurrentAccount extends BankAccount {
    private double withdrwLimit;

    public CurrentAccount(String accountNumber, double balance, double withdrwLimit) {
        super(accountNumber, balance);
        this.withdrwLimit = withdrwLimit;
    }
    public void withdraw(){  //Child class method here
        System.out.println("Withdraw method ");
    }
}
