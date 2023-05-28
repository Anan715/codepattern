package com.code.pattern.factory;

public class Book extends Product {
    private String author;

    public Book(long id, String name, double price, String author) {
        super(id, name, price);
        this.author = author;
    }

    public String getProductName() {
        return name + " (by " + author + ")";
    }

    public double getProductPrice() {
        return price;
    }

    public String getProductDescription() {
        return "This book is written by " + author + ".";
    }
}

