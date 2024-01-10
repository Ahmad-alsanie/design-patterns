package domain.driven.domain.event;

import java.util.Date;

public class OrderPlacedEvent {
    private final String orderId;
    private final Date timestamp;

    public OrderPlacedEvent(String orderId) {
        this.orderId = orderId;
        this.timestamp = new Date();
    }

    public String getOrderId() {
        return orderId;
    }

    public Date getTimestamp() {
        return timestamp;
    }
}
