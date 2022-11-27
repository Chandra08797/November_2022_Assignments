package com.cb.yash.array_string;

import java.util.Scanner;

public class StringTask_3 {

    public static String removeVowels(String string){
        char[] charArray = StringTask_1.stringToCharArray(string);
        char[] newString;
        int length = charArray.length;
        String result="";

                                                // first method

        /*for(int i=0; i<length; i++){
            if(charArray[i]=='a'|| charArray[i]=='A' || charArray[i]=='e' || charArray[i]=='E'
                    || charArray[i]=='i' || charArray[i]=='I' || charArray[i]=='o' || charArray[i]=='O'
                    || charArray[i]=='u' || charArray[i]=='U'){
                for(int j=i+1; j<length; j++){
                    charArray[j-1] = charArray[j];
                }
                length--;
            }
        }
        newString = new char[length];
        for(int i=0;i<length;i++){
            newString[i] = charArray[i];
        }
        return new String(newString);
*/
                                                // Method second

        for(int i=0; i<string.length();i++){
            if(string.charAt(i)!='a' && string.charAt(i)!='A' && string.charAt(i)!='e' && string.charAt(i)!='E' &&
                    string.charAt(i)!='i' && string.charAt(i)!='I' && string.charAt(i)!='o' && string.charAt(i)!='O' &&
                    string.charAt(i)!='u' && string.charAt(i)!='U'){
                result = result+string.charAt(i);
            }
        }
        return result;
    }
}

class StringTaskTest{
    static String s1;
    static Scanner scn;
    public static void main(String[] args) {
        scn= new Scanner(System.in);
        System.out.println("Enter First String");
        s1 = scn.nextLine();
         System.out.println(StringTask_3.removeVowels(s1));
    }
}
