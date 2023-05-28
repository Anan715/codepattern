package com.code.pattern.listener;

public class OrderEvent {
    private OrderEventType type;
    private Order order;

    public OrderEvent(OrderEventType type, Order order) {
        this.type = type;
        this.order = order;
    }

    public OrderEventType getType() {
        return type;
    }

    public Order getOrder() {
        return order;
    }
}
