package com.S;

public class Main {
    public static void main(String[] args) {

        Payment p;

        p = new UPI();
        p.pay(500);

        p = new CreditCard();
        p.pay(1000);
    }
}