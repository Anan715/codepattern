package com.code.pattern.strategy.demo1;

/**
 * 总价折扣
 */
public class StrategyMain {
    public static void main(String[] args) {
        Context context = new Context(new ConcretePriceStrategy1());
        double price = 10.0;
        int count = 15;
        double totalPrice = context.calculatePrice(price, count);
        System.out.println("商品总价：" + totalPrice);

        context.setPriceStrategy(new ConcretePriceStrategy2());
        totalPrice = context.calculatePrice(price, count);
        System.out.println("折扣后商品总价：" + totalPrice);
    }
}
