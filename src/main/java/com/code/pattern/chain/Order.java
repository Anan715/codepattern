package com.code.pattern.chain;

import lombok.Data;

@Data
public class Order {
    private String orderId;
    private double amount;
    private boolean isPayed;
    private boolean isVerified;
    private boolean isStockChecked;
    private boolean isDispatched;
    //省略getter和setter方法
}

