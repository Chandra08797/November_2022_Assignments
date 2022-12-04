package com.cb.yash.java8_steam_api.stream_api;

import java.time.LocalDateTime;
import java.util.Comparator;

public class Item implements Comparable<Item> , Comparator<Item> {
    private int itemId;
    private String itemName;
    private LocalDateTime dateOfManufacture;
    private LocalDateTime dateOfExpiry;
    private int price;

    public Item() {

    }

    public Item(int itemId, String itemName, LocalDateTime dateOfManufacture,
                LocalDateTime dateOfExpiry, int price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.dateOfManufacture = dateOfManufacture;
        this.dateOfExpiry = dateOfExpiry;
        this.price = price;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public LocalDateTime getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(LocalDateTime dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public LocalDateTime getDateOfExpiry() {
        return dateOfExpiry;
    }

    public void setDateOfExpiry(LocalDateTime dateOfExpiry) {
        this.dateOfExpiry = dateOfExpiry;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", dateOfManufacture=" + dateOfManufacture +
                ", dateOfExpiry=" + dateOfExpiry +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Item e) {
        return Integer.compare(getPrice(), e.getPrice());
    }

    @Override
    public int compare(Item i1, Item i2) {
        return i1.getPrice()<i2.getPrice() ? i1.getPrice(): i2.getPrice();
    }
}
