package com.code.pattern.builder.product;

import java.util.List;

public class ConcreteProductBuilder implements ProductBuilder {
    private Product product = new Product(null, null, null, null);

    @Override
    public void setMaterial(String material) {
        product.setMaterial(material);
    }

    @Override
    public void setColor(String color) {
        product.setColor(color);
    }

    @Override
    public void setSize(String size) {
        product.setSize(size);
    }

    @Override
    public void setAccessories(List<String> accessories) {
        product.setAccessories(accessories);
    }

    @Override
    public Product build() {
        return product;
    }
}

