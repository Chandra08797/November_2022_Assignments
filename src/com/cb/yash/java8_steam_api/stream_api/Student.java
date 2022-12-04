package com.cb.yash.java8_steam_api.stream_api;

import java.util.*;
import java.util.stream.Collectors;

public class Student {
    private int rollno;
    private String date_of_addmission;
    private String dob;
    private int maths;
    private int physics;
    private int chemistry;
    private int English;
    private int hindi;
    private String classname;

    public Student() {

    }

    public Student(int rollno, String date_of_addmission, String dob, int maths,
                   int physics, int chemistry, int english, int hindi, String classname) {
        this.rollno = rollno;
        this.date_of_addmission = date_of_addmission;
        this.dob = dob;
        this.maths = maths;
        this.physics = physics;
        this.chemistry = chemistry;
        English = english;
        this.hindi = hindi;
        this.classname = classname;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getDate_of_addmission() {
        return date_of_addmission;
    }

    public void setDate_of_addmission(String date_of_addmission) {
        this.date_of_addmission = date_of_addmission;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getPhysics() {
        return physics;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public int getChemistry() {
        return chemistry;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }

    public int getEnglish() {
        return English;
    }

    public void setEnglish(int english) {
        English = english;
    }

    public int getHindi() {
        return hindi;
    }

    public void setHindi(int hindi) {
        this.hindi = hindi;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", date_of_addmission='" + date_of_addmission + '\'' +
                ", dob='" + dob + '\'' +
                ", maths=" + maths +
                ", physics=" + physics +
                ", chemistry=" + chemistry +
                ", English=" + English +
                ", hindi=" + hindi +
                ", classname='" + classname + '\'' +
                '}';
    }
}

class Test{
    public static void main(String[] args) {
        Student s1 = new Student(101, "12/06/2020", "12/08/2006", 50,30,80,35,80, "10th");
        Student s2 = new Student(102, "13/06/2020", "13/08/2006", 50,50,50,50,80, "10th");
        Student s3 = new Student(103, "14/06/2020", "14/08/2006", 80,80,80,85,80, "10th");
        Student s4 = new Student(104, "15/06/2020", "15/08/2006", 10,30,20,35,80, "10th");
        Student s5 = new Student(105, "16/06/2020", "16/08/2006", 50,90,80,40,80, "10th");
        Student s6 = new Student(105, "16/06/2020", "16/08/2006", 80,90,80,80,80, "10th");

        ArrayList<Student> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, s1,s2, s3, s4, s5, s6);
        Map<Integer, Integer> studentResults = GenerateResult.generateResult(arrayList);

        List<Integer> failed = studentResults.keySet().stream().filter(key -> studentResults.get(key) < 40).collect(Collectors.toList());
        System.out.println("failed students are:\t");
        for(int i : failed)
            System.out.println(i + ".............."+ studentResults.get(i));
        System.out.println();

        System.out.println(" students who scored more then 70% in any three subjects are:\t");
        arrayList.stream().filter((e)->{
            int count =0;
            if(e.getPhysics()>75)
                count++;
            if(e.getMaths()>75)
                count++;
            if(e.getHindi()>75)
                count++;
            if(e.getEnglish()>75)
                count++;
            if(e.getChemistry()>75)
                count++;
                return count>=3?true:false;
        }).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println();

        System.out.println(" students who scored more then 70% all subjects are:\t");
        arrayList.stream().filter((e)->{
            int count =0;
            if(e.getPhysics()>75)
                count++;
            if(e.getMaths()>75)
                count++;
            if(e.getHindi()>75)
                count++;
            if(e.getEnglish()>75)
                count++;
            if(e.getChemistry()>75)
                count++;
            return count>=5?true:false;
        }).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println();

        System.out.println(" students who failed at least in one subjects are:\t");
        arrayList.stream().filter((e)->{
            int count =0;
            if(e.getPhysics()<40)
                count++;
            if(e.getMaths()<40)
                count++;
            if(e.getHindi()<40)
                count++;
            if(e.getEnglish()<40)
                count++;
            if(e.getChemistry()<40)
                count++;
            return count>=1?true:false;
        }).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println();

        System.out.println(" students who will be promoted in new class are:\t");
        arrayList.stream().filter((e)->{
            int count =0;
            if(e.getPhysics()>40)
                count++;
            if(e.getMaths()>40)
                count++;
            if(e.getHindi()>40)
                count++;
            if(e.getEnglish()>40)
                count++;
            if(e.getChemistry()>40)
                count++;
            return count >= 5;
        }).collect(Collectors.toList()).forEach(System.out::println);
    }
}

class GenerateResult{
    static Map<Integer, Integer> studentResult = new HashMap<>();
    public static Map<Integer, Integer>  generateResult(List<Student> studentList){
        for(Student s : studentList){
            var result = (s.getChemistry()+s.getEnglish()+s.getHindi()+s.getMaths()+s.getPhysics())/5;
            studentResult.put(s.getRollno(), result);
        }
        return studentResult;
    }
}
