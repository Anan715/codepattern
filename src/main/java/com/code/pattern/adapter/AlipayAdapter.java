package com.code.pattern.adapter;

public class AlipayAdapter implements PaymentService {
    private AlipayService alipayService;

    public AlipayAdapter(AlipayService alipayService) {
        this.alipayService = alipayService;
    }

    @Override
    public void pay(double amount) {
        alipayService.aliPay(amount);
    }
}
