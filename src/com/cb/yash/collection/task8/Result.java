package com.cb.yash.collection.task8;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Result {
    public static void getResult(List<ProductionFacility> productionFacilityList){
        List<ProductionFacility> sortedList = productionFacilityList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("\n\t\t\thighest production as per day");
        System.out.println(sortedList.get(0).toString());
        System.out.println();

        for(int i=0; i<sortedList.size(); i++){
            System.out.println(sortedList.get(i).toString()+"\n");
        }
    }
}
