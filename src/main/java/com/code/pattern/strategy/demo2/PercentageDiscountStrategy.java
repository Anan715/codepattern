package com.code.pattern.strategy.demo2;

public class PercentageDiscountStrategy implements DiscountStrategy {
    private final double percentage;

    public PercentageDiscountStrategy(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double apply(double totalAmount) {
        return totalAmount * (1 - percentage);
    }
}