package com.sanie.structural.adapter;

class StripeAdapter implements PaymentProcessor {
    private final StripePaymentProcessor stripeProcessor;

    public StripeAdapter(StripePaymentProcessor stripeProcessor) {
        this.stripeProcessor = stripeProcessor;
    }

    public void processPayment(String amount) {
        stripeProcessor.pay(amount);
    }
}