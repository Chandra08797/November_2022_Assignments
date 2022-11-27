package com.cb.yash.collection.task9;

import java.util.HashMap;
import java.util.Map;

public class Test9 {
    public static void main(String[] args) {
        Employee[] employees =  new Employee[6];
        int empIdStart = 100;
        String[] name = {"rajat", "shriman", "venkata", "jr. Ntr", "virendra", "vijaya"};
        int[] salary = {20000,30000,40000,50000,60000,70000};
        String[] dept = {"IT", "IT", "IT", "IT", "IT", "IT"};
        String[] address = {"hyderabad", "indore", "delhi", "pune", "bangalore", "chandigarh"};

        for(int i=0; i<employees.length; i++)
            employees[i] = new Employee(empIdStart+i , name[i], salary[i], dept[i], address[i]);

        Map<Integer,String> employeeMap = new HashMap<>();

        for(int i=0; i<employees.length; i++)
            employeeMap.put(employees[i].getEmpId(), employees[i].getEmpName());

        for (Object key : employeeMap.keySet()) {
            System.out.println(employeeMap.get(key));;
        }

    }
}
