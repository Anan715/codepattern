package com.code.pattern.chain;

// 库存处理器 StockHandler
public class StockHandler implements OrderHandler {
    private OrderHandler nextHandler;

    public StockHandler(OrderHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(Order order) {
        if (!order.isVerified()) {
            System.out.println("订单未审核，库存占用失败。");
            return;
        }
        // 库存占用处理逻辑
        order.setStockChecked(true);
        System.out.println("库存占用成功，订单号：" + order.getOrderId());
        // 调用下一个处理器
        if (nextHandler != null) {
            nextHandler.handle(order);
        }
    }
}
