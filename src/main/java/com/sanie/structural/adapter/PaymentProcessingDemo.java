package com.sanie.structural.adapter;

public class PaymentProcessingDemo {
    public static void main(String[] args) {
        PayPalPaymentProcessor payPalProcessor = new PayPalProcessor();
        payPalProcessor.processPayment("$100");

        // Integrating Stripe using Adapter
        PayPalPaymentProcessor stripeAdapter = new StripeAdapter(new StripeProcessor());
        stripeAdapter.processPayment("$200");
    }
}