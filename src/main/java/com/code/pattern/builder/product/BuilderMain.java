package com.code.pattern.builder.product;

import java.util.Arrays;

public class BuilderMain {
    public static void main(String[] args) {
        ProductBuilder builder = new ConcreteProductBuilder();
        builder.setMaterial("Cotton");
        builder.setColor("Red");
        builder.setSize("L");
        builder.setAccessories(Arrays.asList("Button", "Pocket"));
        Product product = builder.build();
        System.out.println(product);

    }
}
