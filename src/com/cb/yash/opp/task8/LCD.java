package com.cb.yash.opp.task8;

public class LCD implements ID, SemiconductorType, DateOfManufacturing{
    @Override
    public String getManufactureDate() {
        return "12/10/2021";
    }

    @Override
    public int getIdOfProduct() {
        return 105;
    }

    @Override
    public String semiConductorVariety() {
        return "electric redmi lca 14W";
    }
}
