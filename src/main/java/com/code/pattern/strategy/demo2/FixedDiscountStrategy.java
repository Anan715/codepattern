package com.code.pattern.strategy.demo2;

public class FixedDiscountStrategy implements DiscountStrategy {
    private final double discount;

    public FixedDiscountStrategy(double discount) {
        // 减免的金额
        this.discount = discount;
    }

    @Override
    public double apply(double totalAmount) {
        // 最终金额
        return totalAmount - discount;
    }
}