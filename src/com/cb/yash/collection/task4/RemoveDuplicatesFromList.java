package com.cb.yash.collection.task4;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromList {
    public static List<?> removeDuplicatesAndSortInDescending(List<Integer> list){
        return new HashSet<>(list).stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }
}
