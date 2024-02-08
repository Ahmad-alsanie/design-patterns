package com.sanie.behavioral.strategy;

public class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using PayPal.");
    }
}
