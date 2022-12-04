package com.cb.yash.java8_steam_api.stream_api.task2;

import com.cb.yash.java8_steam_api.stream_api.Item;
import com.cb.yash.java8_steam_api.task9.Student;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class HighestPrice {
    public static void getHighestPricesItem(List<Item> itemList){
        Collections.sort(itemList);
        System.out.println(itemList.get(itemList.size()-1));
    }
}
