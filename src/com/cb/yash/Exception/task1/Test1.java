package com.cb.yash.Exception.task1;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    static int rollNo;
    static String sName;
    static String sAddress;
    static int english;
    static int math;
    static int chemistry;
    static int physics;
    static int hindi;
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) throws ResultException {

        studentDetails();

        try{
            if(rollNo<0 || english<0 || math<0 || chemistry<0 || physics<0 || hindi<0)
                throw new ResultException("\t\t\tplease enter positive roll no or positive marks");

            ArrayList <Integer> markList = new ArrayList<>();
            Collections.addAll(markList, english, math, chemistry, physics, hindi);
            List<Integer> failedSubject = markList.stream().filter(mark -> mark < 40).collect(Collectors.toList());

            Student s = new Student(rollNo, sName, sAddress, english, math, chemistry, physics, hindi);
            StudentResult.calculateResultScore(s);
            Map<String, Double> result = StudentResult.getAllResult();
            result.keySet().forEach(key->System.out.println(key +"\t=\t"+ result.get(key)+"%"));

                try{
                    if(s.getMarkObtain()<40 && failedSubject.size()>=2 )
                        throw new ResultException("Result of Student is Fail");
                    else {
                        s.setsResult("pass");
                        System.out.println("Student is passed with:\t"+ s.getMarkObtain()+"%");
                    }
                }catch (ResultException re){
                    System.out.println(re.getMessage());
                    System.out.println("Failed in "+failedSubject.size()+"\tsubjects\n");
                }

        }catch (ResultException re){
            System.out.println(re.getMessage());
        }
    }

    public static void studentDetails(){
        System.out.println("Enter Roll No of student:\t");
        rollNo = scn.nextInt();
        scn.nextLine();
        System.out.println("Enter Name of student:\t");
        sName  = scn.nextLine();
        System.out.println("Enter Address of student:\t");
        sAddress= scn.nextLine();
        System.out.println("Enter English marks:\t");
        english=scn.nextInt();
        System.out.println("Enter math marks:\t");
        math=scn.nextInt();
        System.out.println("Enter chemisty marks:\t");
        chemistry=scn.nextInt();
        System.out.println("Enter physics marks:\t");
        physics=scn.nextInt();
        System.out.println("Enter hindi marks:\t");
        hindi=scn.nextInt();
    }
}
