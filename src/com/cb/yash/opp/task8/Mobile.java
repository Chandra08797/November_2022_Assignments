package com.cb.yash.opp.task8;

public class Mobile implements ID, SemiconductorType, DateOfManufacturing{
    @Override
    public String getManufactureDate() {
        return "10/10/2021";
    }

    @Override
    public int getIdOfProduct() {
        return 101;
    }

    @Override
    public String semiConductorVariety() {
        return "Apple 14 Max pro";
    }
}
