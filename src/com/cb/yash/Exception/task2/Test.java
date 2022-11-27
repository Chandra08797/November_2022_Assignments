package com.cb.yash.Exception.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Parent p = new Child();
        Scanner scanner = new Scanner(System.in);
        int [] arr;
        int size;
        while(true){
            System.out.println("Enter the size of array");
            try{
                arr = new int[scanner.nextInt()];
                System.out.println("enter element of array");
               while(true){
                   try{
                       for(int i: arr)
                           arr[i] = scanner.nextInt();
                       break;
                   }catch (InputMismatchException e){
                       System.out.println("please enter only numeric value");
                       scanner.nextLine();
                   }
               }
                System.out.println("Biggest Number In Arrays is:\t"+p.getBigFromArray(arr));
            }catch (NegativeArraySizeException e){
                System.out.println("please pass +ve size for array");
                scanner.nextLine();
            }
            break;
        }
    }
}
