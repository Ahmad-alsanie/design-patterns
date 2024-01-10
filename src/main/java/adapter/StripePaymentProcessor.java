package adapter;

interface StripePaymentProcessor {
    void pay(String amount);
}