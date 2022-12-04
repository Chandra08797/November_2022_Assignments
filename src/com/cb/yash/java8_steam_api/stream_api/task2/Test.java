package com.cb.yash.java8_steam_api.stream_api.task2;

import com.cb.yash.java8_steam_api.stream_api.Item;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Item item = new Item(101, "laptop",
                LocalDateTime.of(1998, 2, 13, 15, 56),
                LocalDateTime.of(2000, 2, 13, 15, 56), 25000 );

        Item item1 = new Item(102, "laptop Model 2000",
                LocalDateTime.of(2000, 2, 13, 15, 56),
                LocalDateTime.of(2022, 2, 13, 15, 56), 28000 );

        Item item3 = new Item(103, "laptop i3",
                LocalDateTime.of(2010, 2, 13, 15, 56),
                LocalDateTime.of(2030, 2, 13, 15, 56), 30000 );

        Item item4 = new Item(104, "laptop Model i5",
                LocalDateTime.of(2012, 2, 13, 15, 56),
                LocalDateTime.of(2035, 2, 13, 15, 56), 35000 );

        Item item5 = new Item(105, "laptop Model i7",
                LocalDateTime.of(2015, 2, 13, 15, 56),
                LocalDateTime.of(2045, 2, 13, 15, 56), 40000 );

        List<Item> itemList = Arrays.asList(item5, item, item3, item1, item4);
        HighestPrice.getHighestPricesItem(itemList);
    }
}
