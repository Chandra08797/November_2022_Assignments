package com.cb.yash.opp.task1;

public class Person {
    private int pId;
    private String pName;
    private String pAddress;
    private String dob;

    public Person() {

    }

    public Person(int pId, String pName, String pAddress, String dob) {
        this.pId = pId;
        this.pName = pName;
        this.pAddress = pAddress;
        this.dob = dob;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpAddress() {
        return pAddress;
    }

    public void setpAddress(String pAddress) {
        this.pAddress = pAddress;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
