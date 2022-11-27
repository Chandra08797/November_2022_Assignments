package com.cb.yash.collection.task8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Test8 {
    public static void main(String[] args) {
        List<ProductionFacility> productionFacilityList = new ArrayList<>();

        productionFacilityList.add(new ProductionFacility(101,"produce", "indore", 100, new String[]{"white cement","black cement"},LocalDate.parse("2022-08-16")));
        productionFacilityList.add(new ProductionFacility(102,"produce", "indore", 200, new String[]{"white putti","black putti"},LocalDate.parse("2022-08-17")));
        productionFacilityList.add(new ProductionFacility(103,"produce", "indore", 120, new String[]{"white destemper","black destemper"},LocalDate.parse("2022-08-18")));
        productionFacilityList.add(new ProductionFacility(104,"produce", "indore", 350, new String[]{"white paint","black paint"},LocalDate.parse("2022-08-18")));

        Result.getResult(productionFacilityList);
    }
}
