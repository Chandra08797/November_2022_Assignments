package com.cb.yash.Exception.task1;

public class SubjectAndMarks {
    private int english;
    private int math;
    private int chemistry;
    private int physics;
    private int hindi;
    private double markObtain;

    public SubjectAndMarks(int english, int math, int chemistry, int physics, int hindi) {
        this.english = english;
        this.math = math;
        this.chemistry = chemistry;
        this.physics = physics;
        this.hindi = hindi;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getChemistry() {
        return chemistry;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }

    public int getPhysics() {
        return physics;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public int getHindi() {
        return hindi;
    }

    public void setHindi(int hindi) {
        this.hindi = hindi;
    }

    public double getMarkObtain() {
        return markObtain;
    }

    public void setMarkObtain(double markObtain) {
        this.markObtain = markObtain;
    }
}
