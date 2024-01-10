package domain.driven.aggregate;

import java.util.List;

public class OrderService {
    public void createOrder(String orderId, List<OrderItem> items, PaymentDetails paymentDetails) {
        Order order = new Order(orderId);
        items.forEach(order::addItem);
        order.processPayment(paymentDetails);
        // Persist order using a repository
    }

    // Other methods related to order management...
}

