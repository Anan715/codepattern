package com.code.pattern.medium;

public class MediumMain {
    /**
     * 电商项目中适用于中介者模式的典型场景是购物车。购物车中存在多个商品，
     * 商品之间可能会影响到彼此的价格和数量。中介者模式可以帮助我们管理购物车中的商品，
     * 并通过中介者进行交互。
     *
     * 例如，当加入一个商品到购物车中时，需要检查购物车中是否已存在该商品，如果已存在，
     * 则增加商品数量，否则添加新的商品到购物车中。同时，当修改一个商品的数量时，需要更新购物车中的总价。
     * 下面是一个简单的购物车示例代码，采用中介者模式来管理购物车中的商品。
     *
     */
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("商品1", 10.0, 1);
        cart.addItem(item1);
        System.out.println("总价：" + cart.getTotalPrice() + "，总数：" + cart.getTotalCount());

        Item item2 = new Item("商品2", 20.0, 1);
        cart.addItem(item2);
        System.out.println("总价：" + cart.getTotalPrice() + "，总数：" + cart.getTotalCount());

        Item item3 = new Item("商品1", 15.0, 1);
        cart.addItem(item3);
        System.out.println("总价：" + cart.getTotalPrice() + "，总数：" + cart.getTotalCount());

        item1.increaseCount();
        System.out.println("总价：" + cart.getTotalPrice() + "，总数：" + cart.getTotalCount());

        item3.increaseCount();
        System.out.println("总价：" + cart.getTotalPrice() + "，总数：" + cart.getTotalCount());

        item2.decreaseCount();
        System.out.println("总价：" + cart.getTotalPrice() + "，总数：" + cart.getTotalCount());

        cart.removeItem(item3);
        System.out.println("总价：" + cart.getTotalPrice() + "，总数：" + cart.getTotalCount());


    }
}
