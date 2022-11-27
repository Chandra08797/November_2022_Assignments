package com.cb.yash.opp.task2;

import java.util.Scanner;

public class Triangle implements Shape{
    static Scanner scanner;
    @Override
    public void area() {
        scanner = new Scanner(System.in);
        System.out.println("Enter the x and y vertex of A:\t");
        String[] sideOne = scanner.nextLine().split(" ");
        System.out.println("Enter the vertex of B:\t");
        String[] sideTwo = scanner.nextLine().split(" ");
        System.out.println("Enter the vertex of C:\t");
        String[] sideThree = scanner.nextLine().split(" ");

        int aX = Integer.parseInt(sideOne[0]);
        int aY = Integer.parseInt(sideOne[1]);

        int bX = Integer.parseInt(sideTwo[0]);
        int bY = Integer.parseInt(sideTwo[1]);

        int cX = Integer.parseInt(sideThree[0]);
        int cY = Integer.parseInt(sideThree[1]);

        double abDistance = Math.sqrt(bX-aX +bY-aY);
        double bcDistance = Math.sqrt(cX-bX+cY-bY);
        double acDistance = Math.sqrt(cX-aX+cY-aY);

        double areaTriangle = ((aX * (bY - cY) + bX * (cY - aY) + cX * (aY - bY))) / 2;
        System.out.println("The area of the triangle is:\t " + Math.abs(areaTriangle));
        System.out.println("distance between ab is:\t"+  Math.abs(abDistance));
        System.out.println("distance between bc is:\t"+ Math.abs(bcDistance));
        System.out.println("distance between ac is:\t"+ Math.abs(acDistance));
    }
}
