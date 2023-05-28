package com.code.pattern.chain;

// 订单审核处理器 VerifyHandler
public class VerifyHandler implements OrderHandler {
    private OrderHandler nextHandler;

    public VerifyHandler(OrderHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(Order order) {
        if (!order.isPayed()) {
            System.out.println("订单未支付，审核失败。");
            return;
        }
        // 订单审核处理逻辑
        System.out.println("订单审核成功，订单号：" + order.getOrderId());
        order.setVerified(true);
        // 调用下一个处理器
        if (nextHandler != null) {
            nextHandler.handle(order);
        }
    }
}

