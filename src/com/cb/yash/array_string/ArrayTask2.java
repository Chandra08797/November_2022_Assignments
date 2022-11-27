package com.cb.yash.array_string;

import java.util.Scanner;

public class ArrayTask2 {
    public static void countNumberOccurance(){
        double[] number;
        double temp=0;
        int count=0;
        int length;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length of array:\t");
        number = new double[scn.nextInt()];
        System.out.println("Enter the elements of array:\t");

        for(int i=0; i<number.length;i++){
            number[i] = scn.nextDouble();
        }
        length = number.length;

        for(int i=0; i<length;i++){
            for(int j=i+1; j<length;j++){
                if(number[i] == number[j]){
                   number[j] = number[length-1];
                   length--;
                   j--;
                   count++;
                }
            }
            System.out.println("Total occurrence of "+ number[i]+" is:\t"+ ++count);
            count=0;
        }
    }
}

class ArrayTask2Test{
    public static void main(String[] args) {
        ArrayTask2.countNumberOccurance();
    }
}