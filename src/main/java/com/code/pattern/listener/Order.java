package com.code.pattern.listener;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    // 订单号、金额、收件人信息
    private String orderId;
    private double amount;
    private String recipient;
}
