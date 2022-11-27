package com.cb.yash.Exception.task6;

public class ItemBought{
    private int itemId;
    private int itemQuantity;
    private int TotalPrice;

    public ItemBought(int itemId, int itemQuantity, int totalPrice) {
        this.itemId = itemId;
        this.itemQuantity = itemQuantity;
        TotalPrice = totalPrice;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public int getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        TotalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "ItemBought{" +
                "itemId=" + itemId +
                ", itemQuantity=" + itemQuantity +
                ", TotalPrice=" + TotalPrice +
                '}';
    }
}
