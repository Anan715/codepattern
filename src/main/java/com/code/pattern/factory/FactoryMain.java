package com.code.pattern.factory;

public class FactoryMain {
    public static void main(String[] args) {
        Product book = ProductFactory.createProduct(1, "Java Programming", 50.0, "book", "Mark Smith");
        Product electronic = ProductFactory.createProduct(2, "iPhone 12", 999.0, "electronic", "Apple");

        // get product info
        System.out.println(book.getProductName());
        System.out.println(book.getProductPrice());
        System.out.println(book.getProductDescription());
        System.out.println(electronic.getProductName());
        System.out.println(electronic.getProductPrice());
        System.out.println(electronic.getProductDescription());

    }
}
