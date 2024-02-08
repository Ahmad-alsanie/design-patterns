package com.sanie.driven.domain.event;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class EventPublisher {
    private static final List<Consumer<OrderPlacedEvent>> listeners = new ArrayList<>();

    public static void publish(OrderPlacedEvent event) {
        for (Consumer<OrderPlacedEvent> listener : listeners) {
            listener.accept(event);
        }
    }

    public static void subscribe(Consumer<OrderPlacedEvent> listener) {
        listeners.add(listener);
    }
}
