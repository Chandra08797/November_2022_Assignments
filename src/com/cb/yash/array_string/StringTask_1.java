package com.cb.yash.array_string;

import java.util.Scanner;

public class StringTask_1 {

   // this method is going to perform task as per question need.
    public static String insertStringInIndex(String s1, String s2, int index){
        char [] charArray;
        String result="";

        charArray = stringToCharArray(s1);

        for(int i=0; i<charArray.length;i++){
            if (i!=index)
                result = result + charArray[i];
            else
                result = result + s2+ charArray[i];
        }
        return result;
    }

    // This method is going to convert string in charArray without using builtin method
    public static char [] stringToCharArray(String string){
        int length = string.length();
        char [] charArray = new char[length];
        for(int i=0; i<length; i++){
            charArray[i] = string.charAt(i);
        }
        return charArray;
    }
}

class StringTask1Test{
    static String s1;
    static String s2;
    static int index;
    static String result = "" ;
    static Scanner scn;

    public static void main(String[] args) {
        scn= new Scanner(System.in);
        System.out.println("Enter First String");
        s1 = scn.nextLine();

        System.out.println("Enter Second String");
        s2 = scn.nextLine();

        System.out.println("enter first String index where you want to insert second string");
        index = scn.nextInt();

        System.out.println(StringTask_1.insertStringInIndex(s1,s2,index));
    }
}
