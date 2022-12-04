package com.cb.yash.java8_steam_api.stream_api.task3;

import com.cb.yash.java8_steam_api.stream_api.Item;

import java.util.Collections;
import java.util.List;

public class LeastPrice {
    public static void getHighestPricesItem(List<Item> itemList){
        Collections.sort(itemList);
        System.out.println(itemList.get(0));
    }
}
