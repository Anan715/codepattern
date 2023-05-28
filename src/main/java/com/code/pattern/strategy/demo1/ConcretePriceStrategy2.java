package com.code.pattern.strategy.demo1;

public class ConcretePriceStrategy2 implements PriceStrategy {
    @Override
    public double calculatePrice(double price, int count) {
        double totalPrice = price * count;
        if (totalPrice >= 100.0) {
            return totalPrice * 0.9;
        } else {
            return totalPrice;
        }
    }
}