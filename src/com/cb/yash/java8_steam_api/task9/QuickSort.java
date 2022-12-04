package com.cb.yash.java8_steam_api.task9;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("ramu", 10));
        studentList.add(new Student("amit", 20));
        studentList.add(new Student("shyamu", 18));
        studentList.add(new Student("megha", 36));

        studentList.sort((Student s1, Student s2) -> s1.getStudentName().compareTo(s2.getStudentName()));

        System.out.println(studentList.toString());

    }
}
