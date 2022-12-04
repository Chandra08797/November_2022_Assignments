package com.cb.yash.java8_steam_api.stream_api.task1;


import com.cb.yash.java8_steam_api.stream_api.Item;

import java.util.List;
import java.util.stream.Collectors;

public class Average {
    static int sum=0;
    public static int getAveragePriceOfItem(List<Item> items) {
        List<Integer> itemPrices = items.stream().map(Item::getPrice).collect(Collectors.toList());
        for (int p : itemPrices)
            sum = sum + p;
        return sum/itemPrices.size();
    }
}