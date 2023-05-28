package com.code.pattern.listener;

import java.util.ArrayList;
import java.util.List;

public class OrderEventPublisher {
    private List<OrderEventListener> listeners;

    public OrderEventPublisher() {
        listeners = new ArrayList<>();
    }

    public void addOrderEventListener(OrderEventListener listener) {
        listeners.add(listener);
    }

    public void removeOrderEventListener(OrderEventListener listener) {
        listeners.remove(listener);
    }

    public void publishOrderEvent(OrderEventType eventType, Order order) {
        OrderEvent event = new OrderEvent(eventType, order);
        for (OrderEventListener listener : listeners) {
            switch (eventType) {
                case CREATED:
                    listener.onOrderCreated(event);
                    break;
                case PAID:
                    listener.onOrderPaid(event);
                    break;
                case SHIPPED:
                    listener.onOrderShipped(event);
                    break;
            }
        }
    }
}

