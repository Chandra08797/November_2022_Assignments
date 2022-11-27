package com.cb.yash.array_string;

import java.util.Scanner;

public class StringTask_4 {

    public static void countNoOfCharacter(String str){
        int length = str.length();
        char [] strchars = str.toCharArray();
        int count=0;

        //converting all string in lowercase so that it become easy to compare
        for(int i=0; i<length;i++){
            if(strchars[i]>='A' && strchars[i]<='Z'){
                strchars[i]=(char)((int)strchars[i]+32);
            }
        }

        //checking total no of occurrence
        for(int i=0; i<length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (strchars[i] == strchars[j]) {
                    strchars[j] = strchars[length-1];
                    length--;
                    j--;
                    count++;
                }
            }
            System.out.println("Total occurrence of "+ strchars[i]+" is:\t"+ ++count);
            count=0;
        }
    }
}

class StringTask4Test{
    static String s1;
    static Scanner scn;
    public static void main(String[] args) {
        scn= new Scanner(System.in);
        System.out.println("Enter First String");
        s1 = scn.nextLine();
        StringTask_4.countNoOfCharacter(s1);
    }
}