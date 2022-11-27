package com.cb.yash.Exception.task5;

import java.util.InputMismatchException;

class Calculator{
    public static void add(double a,double b)throws InputMismatchException,
                                                         NumberFormatException,
                                                                IllegalArgumentException{
        double c=a+b;
        System.out.println("Result:\t"+c);
    }
    public static void sub(double a,double b){
        double c=a-b;
        System.out.println("Result:\t"+c);
    }
    public static void mul(double a,double b){
        double c=a-b;
        System.out.println("Result:\t"+c);
    }
    public static void div(double a,double b){
        double c=a/b;
        System.out.println("Result:\t"+c);
    }
}

