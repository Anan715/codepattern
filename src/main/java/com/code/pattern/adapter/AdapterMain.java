package com.code.pattern.adapter;

public class AdapterMain {
    // 适配器模式可以应用于支付系统的集成。
    // 现有的支付系统可能与电商系统的支付接口不兼容，
    // 此时可以使用适配器模式来实现支付系统的集成。
    //下面以支付宝支付为例，演示如何使用适配器模式将现有的支付系统集成到电商系统中
    public static void main(String[] args) {
        AlipayService alipayService = new AlipayService();
        PaymentService paymentService = new AlipayAdapter(alipayService);
        paymentService.pay(100.00);
    }
}
