package com.sanie.driven.domain.event;

public class Order {
    private String id;
    private String customerName;
    private double totalAmount;

    public Order(String id, String customerName, double totalAmount) {
        this.id = id;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
    }

    public String getId() {
        return id;
    }

    public void placeOrder() {
        // Logic for placing the order
        // ...

        // Publish order placed event
        OrderPlacedEvent event = new OrderPlacedEvent(this.id);
        EventPublisher.publish(event);
    }
}
