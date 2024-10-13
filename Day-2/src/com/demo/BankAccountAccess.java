package com.demo;

public class BankAccountAccess {
    public static void main(String[] args) {
        CurrentAccount myaccount=new CurrentAccount("12345",1000,200);
       // BankAccount myaccount=new BankAccount("12345",1000,200);
        myaccount.deposit();
        myaccount.withdraw();

    }
}
