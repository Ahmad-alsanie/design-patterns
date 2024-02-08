package com.sanie.structural.adapter;

class StripeProcessor implements StripePaymentProcessor {
    public void pay(String amount) {
        System.out.println("Processing Stripe payment of " + amount);
    }
}
