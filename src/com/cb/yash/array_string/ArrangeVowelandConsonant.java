package com.cb.yash.array_string;

import java.util.Arrays;

public class ArrangeVowelandConsonant {
    public static void arrangeArrayVowelConsonant(char[] arr){
        int length =  arr.length;
        int count=0;
        char[] newArray = new char[length];
        for(int i=0; i<length; i++){
            if(arr[i]=='a' && arr[i]=='A' && arr[i]=='e' && arr[i]=='E' && arr[i]=='i' && arr[i]=='I' &&
                    arr[i]=='o' && arr[i]=='O' && arr[i]=='u' && arr[i]=='U'){
                newArray[i] = arr[i];
                count++;
            }
        }
        for(int i=0; i<length; i++){
            if(arr[i]!='a' && arr[i]!='A' && arr[i]!='e' && arr[i]!='E' && arr[i]!='i' && arr[i]!='I' &&
                    arr[i]!='o' && arr[i]!='O' && arr[i]!='u' && arr[i]!='U'){
                newArray[count++] = arr[i];
            }
        }

        System.out.println(Arrays.toString(newArray));
    }
}

class ArrangeArrayTest{
    public static void main(String[] args) {
        ArrangeVowelandConsonant.arrangeArrayVowelConsonant(new char[]{'h','k','c','a','y','i','l','e'});
    }
}