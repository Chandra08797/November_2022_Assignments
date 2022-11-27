package com.cb.yash.collection.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,10,20,56,30,48,65,7,95,86,74,86,85,42,35,96 );
        System.out.println(SortCollectionObjects.sortCollectionObjects(list));
    }
}
