package com.code.pattern.chain;

// 派发处理器 DispatchHandler
public class DispatchHandler implements OrderHandler {
    private OrderHandler nextHandler;

    public DispatchHandler(OrderHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(Order order) {
        if (!order.isStockChecked()) {
            System.out.println("库存未占用，物流派发失败。");
            return;
        }
        // 物流派发处理逻辑
        order.setDispatched(true);
        System.out.println("物流派发成功，订单号：" + order.getOrderId());
        // 调用下一个处理器
        if (nextHandler != null) {
            nextHandler.handle(order);
        }
    }
}
