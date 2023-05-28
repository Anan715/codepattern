package com.code.pattern.strategy.demo1;

public class ConcretePriceStrategy1  implements PriceStrategy {
    @Override
    public double calculatePrice(double price, int count) {
        return price * count;
    }
}