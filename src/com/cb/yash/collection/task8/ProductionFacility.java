package com.cb.yash.collection.task8;

import java.time.LocalDate;
import java.util.Arrays;

public class ProductionFacility implements Comparable<ProductionFacility> {

    private int pliId;
    private String proFacilityName;
    private String proFacilityLocation;
    private int totalProductionPerday;
    private String[] itemNames;
    private LocalDate prodDate;

    public ProductionFacility(int pliId, String proFacilityName, String proFacilityLocation,
                              int totalProductionPerday, String[] itemNames, LocalDate prodDate) {
        this.pliId = pliId;
        this.proFacilityName = proFacilityName;
        this.proFacilityLocation = proFacilityLocation;
        this.totalProductionPerday = totalProductionPerday;
        this.itemNames = itemNames;
        this.prodDate = prodDate;
    }

    public int getPliId() {
        return pliId;
    }

    public void setPliId(int pliId) {
        this.pliId = pliId;
    }

    public String getProFacilityName() {
        return proFacilityName;
    }

    public void setProFacilityName(String proFacilityName) {
        this.proFacilityName = proFacilityName;
    }

    public String getProFacilityLocation() {
        return proFacilityLocation;
    }

    public void setProFacilityLocation(String proFacilityLocation) {
        this.proFacilityLocation = proFacilityLocation;
    }

    public int getTotalProductionPerday() {
        return totalProductionPerday;
    }

    public void setTotalProductionPerday(int totalProductionPerday) {
        this.totalProductionPerday = totalProductionPerday;
    }

    public String[] getItemNames() {
        return itemNames;
    }

    public void setItemNames(String[] itemNames) {
        this.itemNames = itemNames;
    }

    public LocalDate getProdDate() {
        return prodDate;
    }

    public void setProdDate(LocalDate prodDate) {
        this.prodDate = prodDate;
    }


    @Override
    public int compareTo(ProductionFacility p) {
        return Integer.compare(getTotalProductionPerday(), p.getTotalProductionPerday());
    }

    @Override
    public String toString(){
        return getPliId()+"\n"+
                Arrays.toString(getItemNames()) +"\n"+
                getProFacilityLocation()+"\n"+
                getTotalProductionPerday()+"\n"+
                getProdDate();
    }
}
