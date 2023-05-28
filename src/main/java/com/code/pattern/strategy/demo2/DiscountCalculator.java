package com.code.pattern.strategy.demo2;

import java.util.HashMap;
import java.util.Map;

public class DiscountCalculator {
    private final Map<Double, DiscountStrategy> discountStrategyMap = new HashMap<>();

    public void addDiscountStrategy(double threshold, DiscountStrategy discountStrategy) {
        discountStrategyMap.put(threshold, discountStrategy);
    }

    public void delDiscountStrategy(double threshold, DiscountStrategy discountStrategy) {
        discountStrategyMap.remove(threshold, discountStrategy);
    }

    public double calculate(double totalAmount) {
        double discount = 0;
        for (Map.Entry<Double, DiscountStrategy> entry : discountStrategyMap.entrySet()) {
            double threshold = entry.getKey();
            DiscountStrategy discountStrategy = entry.getValue();
            if (totalAmount < threshold) {
                break;
            }
            discount = discountStrategy.apply(totalAmount);
        }
        return discount;

    }
}
