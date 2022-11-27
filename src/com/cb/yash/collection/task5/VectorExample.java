package com.cb.yash.collection.task5;

import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

public class VectorExample {
    public static List<?> sortVectorData(Vector<Object> list){
        return list.stream().map(Object::toString).sorted().collect(Collectors.toList());
    }
}
