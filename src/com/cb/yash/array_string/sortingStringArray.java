package com.cb.yash.array_string;

import java.util.Arrays;

public class sortingStringArray {
    public static String[] sortStringArray(String[] arr){
        int length = arr.length;
        String temp="";

        for(int i=0; i<length; i++){
            for(int j=i+1; j<length; j++){
                if(arr[i].length()>arr[j].length()){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}

class sortingStringTest{
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortingStringArray.sortStringArray(new String[]{"ram", "shyam", "ghanshyam", "ramu", "shyamu"})));
    }
}
