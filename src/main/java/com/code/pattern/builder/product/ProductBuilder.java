package com.code.pattern.builder.product;

import java.util.List;

public interface ProductBuilder {
    void setMaterial(String material);
    void setColor(String color);
    void setSize(String size);
    void setAccessories(List<String> accessories);
    Product build();
}
