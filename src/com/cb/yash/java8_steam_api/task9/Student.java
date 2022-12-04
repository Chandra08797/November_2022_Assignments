package com.cb.yash.java8_steam_api.task9;

public class Student {
    private String studentName;
    private int StudentId;

    public Student() {
    }

    public Student(String studentName, int studentId) {
        this.studentName = studentName;
        StudentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", StudentId=" + StudentId +
                '}';
    }
}
