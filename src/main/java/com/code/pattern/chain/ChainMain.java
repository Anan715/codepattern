package com.code.pattern.chain;

public class ChainMain {

    // 责任链模式可以应用于订单处理流程。
    // 订单在电商系统中的处理流程包括订单审核、库存占用、物流派发等多个环节，
    // 每个环节都有不同的处理逻辑和处理人员，
    // 此时可以使用责任链模式来实现订单处理流程的灵活组合和扩展

    public static void main(String[] args) {
        Order order = new Order();
        order.setOrderId("202108150001");
        order.setAmount(1000.00);
        order.setPayed(true);

        OrderHandler dispatchHandler = new DispatchHandler(null);
        OrderHandler stockHandler = new StockHandler(dispatchHandler);
        OrderHandler verifyHandler = new VerifyHandler(stockHandler);

//        verifyHandler = new VerifyHandler(stockHandler);
//        stockHandler = new StockHandler(dispatchHandler);
//        dispatchHandler = new DispatchHandler(stockHandler);

        verifyHandler.handle(order);


    }
}
