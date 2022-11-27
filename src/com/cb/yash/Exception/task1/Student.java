package com.cb.yash.Exception.task1;

public class Student extends SubjectAndMarks {

    private int rollNo;
    private String sName;
    private String sAddress;
    private String sResult;

    public Student(int rollNo, String sName, String sAddress,int english,
                   int math, int chemistry, int physics, int hindi) {
        super(english, math, chemistry, physics, hindi);
        this.rollNo = rollNo;
        this.sName = sName;
        this.sAddress = sAddress;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsAddress() {
        return sAddress;
    }

    public void setsAddress(String sAddress) {
        this.sAddress = sAddress;
    }

    public String getsResult() {
        return sResult;
    }

    public void setsResult(String sResult) {
        this.sResult = sResult;
    }
}
