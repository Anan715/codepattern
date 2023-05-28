package com.code.pattern.listener;

public interface OrderEventListener {
    void onOrderCreated(OrderEvent event);
    void onOrderPaid(OrderEvent event);
    void onOrderShipped(OrderEvent event);
}
