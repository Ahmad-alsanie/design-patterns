package structural.adapter;

class PayPalProcessor implements PayPalPaymentProcessor {
    public void processPayment(String amount) {
        System.out.println("Processing PayPal payment of " + amount);
    }
}
