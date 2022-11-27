package com.cb.yash.collection.task7;

import java.util.ArrayList;
import java.util.List;

public class Test7 {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(10, "ajay", "12th", 70));
        studentList.add(new Student(11, "amit", "12th", 84));
        studentList.add(new Student(12, "raja", "12th", 30));
        studentList.add(new Student(13, "om", "12th", 75));
        studentList.add(new Student(14, "raju", "12th", 27));
        studentList.add(new Student(15, "karan", "12th", 80));
        studentList.add(new Student(16, "satish", "12th", 87));
        studentList.add(new Student(17, "hari", "12th", 70));
        studentList.add(new Student(18, "mansi", "12th", 90));
        studentList.add(new Student(19, "tanishka", "12th", 35));
        studentList.add(new Student(20, "kirti", "12th", 25));
        studentList.add(new Student(21, "omni", "12th", 65));
        studentList.add(new Student(22, "rajni", "12th", 24));
        studentList.add(new Student(23, "kiran", "12th", 67));
        studentList.add(new Student(24, "seela", "12th", 57));
        studentList.add(new Student(25, "anjali", "12th", 40));

        Result.getResult(studentList);
    }
}
