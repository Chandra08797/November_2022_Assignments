package com.cb.yash.collection.task3;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateFromList {

    public static List<?> removeDuplicates(List<Integer> list){
        return new HashSet<>(list).stream().sorted().collect(Collectors.toList());
    }
}
