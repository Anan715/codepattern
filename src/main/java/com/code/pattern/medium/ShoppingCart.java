package com.code.pattern.medium;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        Item existingItem = findItem(item.getName());
        if (existingItem != null) {
            existingItem.increaseCount();
        } else {
            items.add(item);
        }
    }

    public void removeItem(Item item) {
        Item existingItem = findItem(item.getName());
        if (existingItem != null) {
            existingItem.decreaseCount();
            if (existingItem.getCount() == 0) {
                items.remove(existingItem);
            }
        }
    }

    public double getTotalPrice() {
        double totalPrice = 0.0;
        for (Item item : items) {
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }

    public int getTotalCount() {
        int totalCount = 0;
        for (Item item : items) {
            totalCount += item.getCount();
        }
        return totalCount;
    }

    private Item findItem(String name) {
        for (Item item : items) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
    }
}
