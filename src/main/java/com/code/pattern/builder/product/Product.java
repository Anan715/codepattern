package com.code.pattern.builder.product;

import lombok.Data;

import java.util.List;

@Data
public class Product {
    private String material;
    private String color;
    private String size;
    private List<String> accessories;

    public Product(String material, String color, String size, List<String> accessories) {
        this.material = material;
        this.color = color;
        this.size = size;
        this.accessories = accessories;
    }

    // 省略 getter 和 setter 方法

    @Override
    public String toString() {
        return "Product{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", accessories=" + accessories +
                '}';
    }
}
