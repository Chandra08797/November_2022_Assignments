package com.cb.yash.array_string;

import java.util.Scanner;

public class StringTask_2 {

    public static String stringInAccending(String string){
        char[] charArray = StringTask_1.stringToCharArray(string);
        char temp;

        for(int i=0; i<charArray.length; i++){
            for(int j=0; j<charArray.length; j++){
                if(charArray[i] < charArray[j]){
                    temp=charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
        }
        return new String(charArray);
    }

    public static String stringInDeccending(String string){
        char[] charArray = StringTask_1.stringToCharArray(string);
        char temp;

        for(int i=0; i<charArray.length; i++){
            for(int j=0; j<charArray.length; j++){
                if(charArray[i] > charArray[j]){
                    temp=charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
        }
        return new String(charArray);
    }
}

class StringTask2Test{
    static Scanner scn;
    static String s1;
    public static void main(String[] args) {
        scn= new Scanner(System.in);
        System.out.println("Enter First String");
        s1 = scn.nextLine();

        System.out.println(StringTask_2.stringInAccending(s1));
        System.out.println(StringTask_2.stringInDeccending(s1));
    }
}
