package com.code.pattern.listener;

public class ConcreteOrderEventListener implements OrderEventListener {
    @Override
    public void onOrderCreated(OrderEvent event) {
        Order order = event.getOrder();
        System.out.println("订单已创建，订单号：" + order.getOrderId());
    }

    @Override
    public void onOrderPaid(OrderEvent event) {
        Order order = event.getOrder();
        System.out.println("订单已支付，订单号：" + order.getOrderId());
    }

    @Override
    public void onOrderShipped(OrderEvent event) {
        Order order = event.getOrder();
        System.out.println("订单已发货，订单号：" + order.getOrderId());
    }
}
