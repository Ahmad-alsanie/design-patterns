package com.sanie.structural.adapter;

public class PaymentProcessingDemo {
    public static void main(String[] args) {
        PaymentProcessor payPalProcessor = new Processor();
        payPalProcessor.processPayment("$100");

        // Integrating Stripe using Adapter
        PaymentProcessor stripeAdapter = new StripeAdapter(new StripeProcessor());
        stripeAdapter.processPayment("$200");
    }
}