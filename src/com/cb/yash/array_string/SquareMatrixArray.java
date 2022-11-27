package com.cb.yash.array_string;

import java.util.Scanner;

public class SquareMatrixArray {
    static Scanner scn;
    public static void printArrayRowColumn(){
        int length;
        System.out.println("Enter size of Array:\t");
        scn=new Scanner(System.in);
        length=scn.nextInt();
        int [][]arr = new int[length][length];

        for(int i=0; i<length; i++){
            System.out.println("Enter elements of "+ (i+1) + "st row\n");
            for(int j=0; j<length; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        for(int i=0; i<length; i= length-1){
            System.out.println("elements of "+ (i==length-1 ? "last" : (i+1))+" row is\n");
            for(int j=0; j<length; j++){
                System.out.println(arr[i][j] + " ");
            }
            if(i==length-1)
                break;
        }

        for(int i=0; i<length; i= length-1){
            System.out.println("elements of "+ (i==length-1 ? "last" : (i+1))+" column is\n");
            for(int j=0; j<length; j++){
                System.out.println(arr[j][i] + " ");
            }
            if(i==length-1)
                break;
        }
    }
}

class SqureMatrixArrayTest{
    public static void main(String[] args) {
        SquareMatrixArray.printArrayRowColumn();
    }
}