package com.cb.yash.Exception.task1;

import java.util.HashMap;
import java.util.Map;

public class StudentResult {

    static Map<String, Double> result = new HashMap<>();
    public static void calculateResultScore(Student student){
           String sName     = student.getsName();
           int english      = student.getEnglish();
           int math         = student.getMath();
           int chemistry    = student.getChemistry();
           int physics      = student.getPhysics();
           int hindi        = student.getHindi();
           double markObtain   = (english+math+chemistry+physics+hindi)/5;
           result.put(sName, markObtain);
    }

    public static Map<String,Double> getAllResult(){
        return result;
    }
}
