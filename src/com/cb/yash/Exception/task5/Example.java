package com.cb.yash.Exception.task5;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Example {
    public static int validate(int a)throws
            NumberFormatException,
            InputMismatchException,
            NegativeArraySizeException{
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter value:\t");
        int x=scn.nextInt();
        if(x<0)
            throw new NegativeArraySizeException("dont enter negative number");
        if(x==0)
            throw new InputMismatchException("dont enter negative number");
        if(x>5000)
            throw new NumberFormatException("dont enter negative number");
        return x;
    }
}