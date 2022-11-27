package com.cb.yash.collection.task6;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapExample {
    public static Map<String ,Long> sortMapObjects(Map<String ,Long> elementData){

        return elementData.entrySet().stream() .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

    }
}
