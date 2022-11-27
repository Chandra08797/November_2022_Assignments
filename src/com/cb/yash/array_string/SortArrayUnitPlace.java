package com.cb.yash.array_string;

import java.util.Arrays;

public class SortArrayUnitPlace {
    public static int[] sortArray(int [] arr){
        int length = arr.length;
        int temp=0;

        for(int i=0; i<length; i++ ){
            for(int j=i+1; j<length; j++){
                if(arr[i]%10>arr[j]%10){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}

class SortArrayUnitPlaceTest{
    public static void main(String[] args) {
        System.out.println(Arrays.toString(SortArrayUnitPlace.sortArray(new int[] {10,2,3,41,12,13,19,81,9})));
    }
}
