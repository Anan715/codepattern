package com.code.pattern.listener;

public class ListenerMain {
    public static void main(String[] args) {

        OrderEventPublisher publisher = new OrderEventPublisher();

        ConcreteOrderEventListener listener1 = new ConcreteOrderEventListener();
        ConcreteOrderEventListener listener2 = new ConcreteOrderEventListener();

        publisher.addOrderEventListener(listener1);
        publisher.addOrderEventListener(listener2);
        Order order = new Order("123456789", 100.0, "张三");
        publisher.publishOrderEvent(OrderEventType.CREATED, order);
        publisher.removeOrderEventListener(listener2);
        publisher.publishOrderEvent(OrderEventType.PAID, order);
        publisher.publishOrderEvent(OrderEventType.SHIPPED, order);
    }


}
