package com.cb.yash.java8_steam_api.stream_api.task4;

import com.cb.yash.java8_steam_api.stream_api.Item;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListToSet {
    public static void getSetList(List<Item> itemList){
        Set<Object> itemSet = new HashSet<>();
        itemList.stream().map((e) -> {
            itemSet.add(e.getItemName());
            itemSet.add(e.getPrice());
            return itemSet;
        }).forEach(System.out::println);
    }
}
