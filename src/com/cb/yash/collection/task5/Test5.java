package com.cb.yash.collection.task5;

import com.cb.yash.collection.task4.RemoveDuplicatesFromList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Test5 {
    public static void main(String[] args) {
        Vector<Object> vector = new Vector<>();
        Collections.addAll(vector,10,"lcd",56,"desktop",48,48,"Monitor",65,7,95,"Mobile",74,96,86,"earbuds",42,35,96 );
        VectorExample.sortVectorData(vector).forEach(System.out::println);
    }
}
