package com.cb.yash.collection.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,10,20,56,30,48,48,65,65,7,95,86,74,96,86,85,42,35,96 );
        RemoveDuplicateFromList.removeDuplicates(list).stream().forEach(System.out::println);
    }
}
