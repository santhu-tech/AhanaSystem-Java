package com.demo2;

public class AccessModifiers {
    public int publicVar = 1;
    protected int protectedVar = 2;
    int defaultVar = 3; // Default (package-private)
    private int privateVar = 4;

    public void display() {
        System.out.println("Public: " + publicVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Default: " + defaultVar);
        System.out.println("Private: " + privateVar);
    }
}

