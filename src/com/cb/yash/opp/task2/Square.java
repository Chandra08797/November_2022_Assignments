package com.cb.yash.opp.task2;

import java.util.Scanner;

public class Square implements Shape {

    static Scanner scanner;
    @Override
    public void area() {
        System.out.println("Enter the x and y vertex of A:\t");
        String[] sideOne = scanner.nextLine().split(" ");
        System.out.println("Enter the vertex of B:\t");
        String[] sideTwo = scanner.nextLine().split(" ");
        System.out.println("Enter the vertex of C:\t");
        String[] sideThree = scanner.nextLine().split(" ");
        System.out.println("Enter the vertex of D:\t");
        String[] sideFour = scanner.nextLine().split(" ");

        int aX = Integer.parseInt(sideOne[0]);
        int aY = Integer.parseInt(sideOne[1]);

        int bX = Integer.parseInt(sideTwo[0]);
        int bY = Integer.parseInt(sideTwo[1]);

        int cX = Integer.parseInt(sideThree[0]);
        int cY = Integer.parseInt(sideThree[1]);

        int dX = Integer.parseInt(sideFour[0]);
        int dY = Integer.parseInt(sideFour[1]);

        double abDistance = Math.sqrt(bX-aX +bY-aY);
        double acDistance = Math.sqrt(cX-aX+cY-aY);
        double cdDistance = Math.sqrt(cX-dX+cY-dY);
        double dbDistance = Math.sqrt(dX-bX+dY-bY);
        double bcDistance = Math.sqrt((cX-bX)*(cX-bX) + (cY-bX)*(cY-bX));
        double adDistance = Math.sqrt((dX-aX)*(dX-aX) + (dY-aY));


        double areaTriangle = (abDistance*abDistance) ;
        System.out.println("The area of the square is:\t " + Math.abs(abDistance));
        System.out.println("distance between ab is:\t"+ Math.abs(abDistance));
        System.out.println("distance between ac is:\t"+ Math.abs(acDistance));
        System.out.println("distance between ac is:\t"+ Math.abs(cdDistance));
        System.out.println("distance between bc is:\t"+ Math.abs(dbDistance));
        System.out.println("distance between ab is:\t"+ Math.abs(adDistance));
        System.out.println("distance between bc is:\t"+ Math.abs(bcDistance));

    }
}
