package com.code.pattern.strategy.demo2;

/**
 * 策略模式：满减计算业务场景
 */
public class TotalMain {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();

        // 配置满减策略，消费总额和优惠金额分别按照“1000减100”、“2000减200”、“3000减300”来设置
        calculator.addDiscountStrategy(1000, new FixedDiscountStrategy(100));
        calculator.addDiscountStrategy(2000, new FixedDiscountStrategy(200));
        calculator.addDiscountStrategy(3000, new FixedDiscountStrategy(300));

        // 消费总额为2000，应享受200元的折扣优惠
        double totalAmount1 = 2000.0;
        double finalAmount1 = totalAmount1 - calculator.calculate(totalAmount1);
        System.out.println("Total amount: " + totalAmount1);
        System.out.println("Discount: " + calculator.calculate(totalAmount1));
        System.out.println("Final amount: " + finalAmount1);

        // 消费总额为4000，应享受300元的折扣优惠
        DiscountCalculator calculator2 = new DiscountCalculator();
        calculator2.addDiscountStrategy(1000, new FixedDiscountStrategy(100));
        calculator2.addDiscountStrategy(2000, new FixedDiscountStrategy(200));
        calculator2.addDiscountStrategy(4000, new FixedDiscountStrategy(300));
        double totalAmount2 = 4000.0;
        double finalAmount2 = totalAmount2 - calculator2.calculate(totalAmount2);
        System.out.println("Total amount: " + totalAmount2);
        System.out.println("Discount: " + calculator2.calculate(totalAmount2));
        System.out.println("Final amount: " + finalAmount2);

        // 消费总额为5000，应享受400元的折扣优惠
        DiscountCalculator calculator3 = new DiscountCalculator();
        calculator3.addDiscountStrategy(1000, new FixedDiscountStrategy(100));
        calculator3.addDiscountStrategy(3000, new FixedDiscountStrategy(300));
        calculator3.addDiscountStrategy(5000, new FixedDiscountStrategy(400));
        double totalAmount3 = 5000.0;
        double finalAmount3 = totalAmount3 - calculator3.calculate(totalAmount3);
        System.out.println("Total amount: " + totalAmount3);
        System.out.println("Discount: " + calculator3.calculate(totalAmount3));
        System.out.println("Final amount: " + finalAmount3);

    }
}
