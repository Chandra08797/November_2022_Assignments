package com.cb.yash.array_string;

import java.util.Scanner;

public class ArrayTask1 {

    public static void getGivenLargeNumber(){
        double[] number;
        double temp=0;
        int maxNumber;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length of array:\t");
        number = new double[scn.nextInt()];
        System.out.println("Enter the elements of array:\t");

        for(int i=0; i<number.length;i++){
            number[i] = scn.nextDouble();
        }

        System.out.println("Enter which maximum number you want like 1st big or 2nd big so on:\t");
        maxNumber = scn.nextInt();

        for(int i=0; i<number.length;i++){
            for(int j=0; j<number.length;j++){
                if(number[i] < number[j]){
                    temp = number[i];
                    number[i]=number[j];
                    number[j]=temp;
                }
            }
        }

        System.out.println(maxNumber+ "maximum number in this list is:\t"+number[maxNumber]);
    }
}

class ArrayTask1Test{
    public static void main(String[] args) {
        ArrayTask1.getGivenLargeNumber();
    }
}