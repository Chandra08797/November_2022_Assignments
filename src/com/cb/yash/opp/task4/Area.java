package com.cb.yash.opp.task4;

import java.util.Scanner;

public class Area {
    static Scanner scanner;
    int choice;
    public void printShapeArea(){
        scanner = new Scanner(System.in);
        System.out.println("Enter Three sides of shape with space between 2-4 without pressing Enter :\t");
        String[] number = scanner.nextLine().split(" ");
        choice = number.length;

        if(choice==2)
            getSquareArea(choice, number);
        else if(choice==3) {
            getTriangleArea(choice, number);
            getRectangelArea(choice, number);
        }
        else
            throw new RuntimeException("invalid input");
    }

    public static void getSquareArea(int choice, String[] number){
        if(number[0].equals(number[1]) )
            System.out.println("Area of square is :\t"+ Integer.parseInt(number[0])*Integer.parseInt(number[0]));
        else
            System.out.println("please enter both sides equal for square");
    }

    public static void getTriangleArea(int choice, String[] number){
        int base   = Integer.parseInt(number[0]);
        int height = Integer.parseInt(number[1]);
        int hp     = Integer.parseInt(number[2]);

        System.out.println("area of triangle is:\t"+ Math.abs((base*height)/2));

        if((hp*hp) == (base*base)+(height*height) )
            System.out.println("This is right angle triangle");
    }

    public static void getRectangelArea(int choice, String[] number){
        System.out.println("\n");
        int fSide = Integer.parseInt(number[0]);
        int sSide = Integer.parseInt(number[1]);
        int tSide = Integer.parseInt(number[2]);

        System.out.println("area of rectangle is:\t"+ fSide*sSide);
    }

}
