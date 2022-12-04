package com.cb.yash.java8_steam_api.stream_api.task5;

import com.cb.yash.java8_steam_api.stream_api.Item;
import com.cb.yash.opp.task5.A;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatePrice {

    static List<Item> newList = new ArrayList<>();
    public static void removeDuplicatePrice(List<Item> itemList){
        itemList.stream().map((e)->{
            for (Item item : itemList) {
                if (item.getPrice()!=e.getPrice())
                    newList.add(e);
            }
            return newList;
        }).collect(Collectors.toList()).forEach(System.out::println);
    }
}


