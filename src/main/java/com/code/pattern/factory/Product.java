package com.code.pattern.factory;

public abstract class Product {
    protected long id;
    protected String name;
    protected double price;

    public Product(long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public abstract String getProductName();

    public abstract double getProductPrice();

    public abstract String getProductDescription();
}
