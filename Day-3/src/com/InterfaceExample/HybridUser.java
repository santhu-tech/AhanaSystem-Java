package com.InterfaceExample;

public class HybridUser implements Admin,User {
    public void login()
    {
        System.out.println("I am in hybriduser ");
    }

    @Override
    public void stockdetails() {
        System.out.println("Stocks are good enough");
    }
}
