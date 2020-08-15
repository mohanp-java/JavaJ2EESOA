package com.session7;

public class Item {
    private int itemId;
    private String name;
    private float price;
    public int getItemId() {
        return itemId;
    }
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }
    public Item(int itemId, String name, float price) {
        super();
        this.itemId = itemId;
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Item [itemId=" + itemId + ", name=" + name + ", price=" + price + "]";
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
}
