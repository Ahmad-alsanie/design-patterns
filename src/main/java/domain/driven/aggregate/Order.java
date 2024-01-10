package domain.driven.aggregate;

import java.util.ArrayList;
import java.util.List;

public class Order { // Aggregate Root
    private String orderId;
    private List<OrderItem> orderItems;
    private PaymentDetails paymentDetails;

    public Order(String orderId) {
        this.orderId = orderId;
        this.orderItems = new ArrayList<>();
        // Initialize other fields
    }

    public void addItem(OrderItem item) {
        // Business logic for adding an item
        orderItems.add(item);
    }

    public void processPayment(PaymentDetails paymentDetails) {
        // Business logic for processing payment
        this.paymentDetails = paymentDetails;
    }

    // Other methods related to order processing
}