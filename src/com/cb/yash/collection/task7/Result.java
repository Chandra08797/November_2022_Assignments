package com.cb.yash.collection.task7;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Result {
    public static void getResult(List<Student> list){
       list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        for(int i=0; i<3; i++){
            System.out.println((i+1)+"st Ranked student is :\t"+ list.get(i).getsName()+"\tSCORED:\t"+list.get(i).getScoredMarks()+"%");
        }

        List<Student> scoredbelowfifty = list.stream().filter(student -> student.getScoredMarks() < 50).collect(Collectors.toList());

        System.out.println("\n\t\t\tstudent who scored below 50%\n");
        for(int i=0; i<scoredbelowfifty.size(); i++){
            System.out.println( "student Name :\t"+ scoredbelowfifty.get(i).getsName()+"\tSCORED:\t"+scoredbelowfifty.get(i).getScoredMarks()+"%");
        }

        List<Student> scoredBelowThirtyFive = list.stream().filter(student -> student.getScoredMarks() < 35).collect(Collectors.toList());

        System.out.println("\n\t\t\tstudent who scored below 35%\n");
        for(int i=0; i<scoredBelowThirtyFive.size(); i++){
            System.out.println( "student Name :\t"+ scoredBelowThirtyFive.get(i).getsName()+"\tSCORED:\t"+scoredBelowThirtyFive.get(i).getScoredMarks()+"%"
            +"\t Result is FAIL");
        }

        List<Student> scoredEverage = list.stream().filter(student -> (student.getScoredMarks() >= 35 && student.getScoredMarks() <= 50)).collect(Collectors.toList());

        System.out.println("\n\t\t\tstudent who scored average\n");
        for(int i=0; i<scoredEverage.size(); i++){
            System.out.println( "student Name :\t"+ scoredEverage.get(i).getsName()+"\tSCORED:\t"+scoredEverage.get(i).getScoredMarks()+"%"
                    +"\t Result is PASS");
        }

        System.out.println("\n\t\t\tAll Student Details");
        for(int i=0; i<list.size(); i++){
            System.out.println( "student Name :\t"+ list.get(i).getsName()+"\t\t\tSCORED:\t"+list.get(i).getScoredMarks()+"%");
        }
    }
}
