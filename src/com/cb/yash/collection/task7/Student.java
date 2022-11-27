package com.cb.yash.collection.task7;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    private int rollNo;
    private String sName;
    private String className;
    private int scoredMarks;

    public Student(int rollNo, String sName, String className, int scoredMarks) {
        this.rollNo = rollNo;
        this.sName = sName;
        this.className = className;
        this.scoredMarks = scoredMarks;
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

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getScoredMarks() {
        return scoredMarks;
    }

    public void setScoredMarks(int scoredMarks) {
        this.scoredMarks = scoredMarks;
    }


    @Override
    public int compareTo(Student s) {
        return Integer.compare(getScoredMarks(), s.getScoredMarks());
    }
}
