package com.sanie.driven.domain.event;

public class OrderService {
    public void placeOrder(Order order) {
        // Logic to place the order
        OrderPlacedEvent event = new OrderPlacedEvent(order.getId());
        EventPublisher.publish(event);
    }
}
