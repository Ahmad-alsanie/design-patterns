package com.sanie.structural.facade;

public class OnlineStoreFacade {
    private InventoryManager inventory;
    private OrderProcessor orderProcessor;
    private PaymentGateway paymentGateway;

    public OnlineStoreFacade() {
        inventory = new InventoryManager();
        orderProcessor = new OrderProcessor();
        paymentGateway = new PaymentGateway();
    }

    public boolean placeOrder(String productId, int quantity, String userDetails, double amount) {
        if (!inventory.checkInventory(productId)) {
            return false;
        }
        orderProcessor.processOrder(productId, quantity);
        paymentGateway.processPayment(userDetails, amount);
        return true;
    }
}
