package com.code.pattern.factory;

public class ElectronicProduct extends Product {
    private String brand;

    public ElectronicProduct(long id, String name, double price, String brand) {
        super(id, name, price);
        this.brand = brand;
    }

    public String getProductName() {
        return brand + " " + name;
    }

    public double getProductPrice() {
        return price;
    }

    public String getProductDescription() {
        return "This electronic product is made by " + brand + ".";
    }
}


