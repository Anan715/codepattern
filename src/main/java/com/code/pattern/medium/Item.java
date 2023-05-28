package com.code.pattern.medium;

import lombok.Data;

@Data
public class Item {
    private String name;
    private double price;
    private int count;

    public Item(String name, double price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    // 省略 getter 和 setter 方法

    public void increaseCount() {
        count++;
    }

    public void decreaseCount() {
        count--;
    }

    public double getTotalPrice() {
        return price * count;
    }
}
