package com.cb.yash.collection.task6;

import java.util.HashMap;
import java.util.Map;

public class Test6 {
    public static void main(String[] args) {
        Map<String, Long> map = new HashMap<>();
        map.put("hyderabad",10000L);
        map.put("Asam", 50200L);
        map.put("sikkim", 6000L);
        map.put("telangana",10000L);
        map.put("indore", 50200L);
        map.put("delhi", 6000L);
        HashMapExample.sortMapObjects(map).keySet().forEach(key->System.out.println(key +"="+ map.get(key)));
    }
}
