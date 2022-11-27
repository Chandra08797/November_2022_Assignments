package com.cb.yash.array_string;

import java.util.Arrays;

public class RemoveNonPalindromString {
    public static String[] removeNonPalindromStr(String[] arr){
        int length = arr.length;
        String[] dummyArray = new String[length];
        String[] newArray;
        int index = 0;

        for(int i=0; i<length; i++){
            if(checkPalindrom(arr[i])){
              dummyArray[index++] = arr[i];
            }
        }
        newArray = new String[index];
        for(int i=0; i<length; i++){
            if(dummyArray[i]!=null){
                newArray[i] = dummyArray[i];
            }
        }
        return newArray;
    }

    public static boolean checkPalindrom(String str){
        int length = str.length();
        char[] charArray = str.toCharArray();
        char temp;
        int i=0;
        int j = length-1;

        for( ; i<length/2; i++, j--){
            temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }
        if(String.valueOf(charArray).equals(str))
            return true;
        else
            return false;
    }
}

class palindromTest{
    public static void main(String[] args) {
        System.out.println( Arrays.toString(
                RemoveNonPalindromString.removeNonPalindromStr(new String[]{"radar", "dada", "shyam", "ram"})));
    }
}
