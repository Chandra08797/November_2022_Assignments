package com.cb.yash.opp.task8;

public class Laptop implements ID, SemiconductorType, DateOfManufacturing{
    @Override
    public String getManufactureDate() {
        return "15/10/2021";
    }

    @Override
    public int getIdOfProduct() {
        return 125;
    }

    @Override
    public String semiConductorVariety() {
        return "mackbook pro 15W";
    }
}
