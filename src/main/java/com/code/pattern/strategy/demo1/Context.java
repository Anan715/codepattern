package com.code.pattern.strategy.demo1;

public class Context {
    private PriceStrategy priceStrategy;

    public Context(PriceStrategy priceStrategy) {
        this.priceStrategy = priceStrategy;
    }

    public void setPriceStrategy(PriceStrategy priceStrategy) {
        this.priceStrategy = priceStrategy;
    }

    public double calculatePrice(double price, int count) {
        return priceStrategy.calculatePrice(price, count);
    }
}
