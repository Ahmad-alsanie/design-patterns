package com.sanie.structural.adapter;

class Processor implements PaymentProcessor {
    public void processPayment(String amount) {
        System.out.println("Processing PayPal payment of " + amount);
    }
}
