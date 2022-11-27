package com.cb.yash.Exception.task5;
import java.util.InputMismatchException;
import java.util.Scanner;
class  UserClass{
    public static void main(String[] args) {
        calculate();
    }
    public static void calculate(){
        start:
        while(true) {
            try {
                System.out.println("\t\t\t\t\t*****Welcome*****");
                System.out.println("please enter your choice...");
                System.out.println("\tfor addition            press- 1");
                System.out.println("\tfor substruction \tpress- 2");
                System.out.println("\tfor Multiplication \tpress- 3");
                System.out.println("\tfor division            press- 4");
                System.out.println("\tfor closing             press- 5");
                Scanner scn=new Scanner(System.in);
                int ch=scn.nextInt();
                double a=0,b=0;
                switch(ch){
                    case 1:
                        while(true){
                            try{
                                System.out.print("Enter First Number:\t");
                                a=scn.nextDouble();
                                System.out.println("\t\t\t+");
                                break;
                            }
                            catch(InputMismatchException e){
                                System.out.println("please enter only integer value........");
                                scn.nextLine();
                            }
                        }
                        while(true){
                            try{
                                System.out.print("Enter Second Number:\t");
                                b=scn.nextDouble();
                                break;
                            }
                            catch(InputMismatchException e){
                                System.out.println("please enter only integer value........");
                                scn.nextLine();
                            }
                        }
                        Calculator.add(a,b);
                        break;
                    case 2:
                        while(true){
                            try{
                                System.out.print("Enter First Number:\t");
                                a=scn.nextDouble();
                                System.out.println("\t\t\t-");
                                break;
                            }
                            catch(InputMismatchException e){
                                System.out.println("please enter only integer value........");
                                scn.nextLine();
                            }
                        }
                        while(true){
                            try{
                                System.out.print("Enter Second Number:\t");
                                b=scn.nextDouble();
                                break;
                            }
                            catch(InputMismatchException e){
                                System.out.println("please enter only integer value........");
                                scn.nextLine();
                            }
                        }
                        Calculator.sub(a,b);
                        break;
                    case 3:
                        while(true){
                            try{
                                System.out.print("Enter First Number:\t");
                                a=scn.nextDouble();
                                System.out.println("\t\t\t*");
                                break;
                            }
                            catch(InputMismatchException e){
                                System.out.println("please enter only integer value........");
                                scn.nextLine();
                            }
                        }
                        while(true){
                            try{
                                System.out.print("Enter Second Number:\t");
                                b=scn.nextDouble();
                                break;
                            }
                            catch(InputMismatchException e){
                                System.out.println("please enter only integer value........");
                                scn.nextLine();
                            }
                        }
                        Calculator.mul(a,b);
                        break;
                    case 4:
                        while(true){
                            try{
                                System.out.print("Enter First Number:\t");
                                a=scn.nextDouble();
                                System.out.println("\t\t\t/");
                                break;
                            }
                            catch(InputMismatchException e){
                                System.out.println("please enter only integer value........");
                                scn.nextLine();
                            }
                        }
                        while(true){
                            try{
                                System.out.print("Enter Second Number:\t");
                                b=scn.nextDouble();
                                if(b<=0) {
                                    System.out.println("division not possible by zero");
                                    System.out.println("Dont enter second number zero");
                                    continue;
                                }
                                break;
                            }
                            catch(InputMismatchException e){
                                System.out.println("please enter only integer value........");
                                scn.nextLine();
                            }
                        }
                        Calculator.div(a,b);
                        break;
                    case 5:
                        System.out.println("\t\t\t\tThankyou.............");
                        break start;
                    default:
                        System.out.println("please enter valid choice.....");
                }//switch close
            }
            catch(InputMismatchException e) {
                System.out.println("please enter numeric value as choice....");
            }
        }//while
    }//method
}//class
