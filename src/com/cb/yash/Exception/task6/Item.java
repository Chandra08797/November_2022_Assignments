package com.cb.yash.Exception.task6;

public class Item {
    private String itemName;
    private int itemId;

    public Item(String itemName, int itemId) {
        this.itemName = itemName;
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public static int getITEM_NUMBER_CAN_BAUGHT() {
        return 10;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", itemId=" + itemId +
                '}';
    }
}
