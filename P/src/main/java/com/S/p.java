package com.S;

interface Payment {
    void pay(int amount);
}

class UPI implements Payment {
    public void pay(int amount) {
        System.out.println("Paid Rs. " + amount + " using UPI");
    }
}

class CreditCard implements Payment {
    public void pay(int amount) {
        System.out.println("Paid Rs. " + amount + " using Credit Card");
    }
}