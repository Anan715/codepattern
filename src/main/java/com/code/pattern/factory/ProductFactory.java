package com.code.pattern.factory;

public class ProductFactory {
    public static Product createProduct(long id, String name, double price, String type, String authorBrand) {
        if (type.equalsIgnoreCase("book")) {
            return new Book(id, name, price, authorBrand);
        } else if (type.equalsIgnoreCase("electronic")) {
            return new ElectronicProduct(id, name, price, authorBrand);
        } else {
            throw new IllegalArgumentException("Invalid product type: " + type);
        }
    }
}
