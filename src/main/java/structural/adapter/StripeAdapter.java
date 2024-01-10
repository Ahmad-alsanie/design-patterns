package structural.adapter;

class StripeAdapter implements PayPalPaymentProcessor {
    private StripePaymentProcessor stripeProcessor;

    public StripeAdapter(StripePaymentProcessor stripeProcessor) {
        this.stripeProcessor = stripeProcessor;
    }

    public void processPayment(String amount) {
        stripeProcessor.pay(amount);
    }
}