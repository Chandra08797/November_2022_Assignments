package com.cb.yash.array_string;

import java.util.Arrays;

public class AscendDescendHalfArray {

    public static int[] getSortedArray(int [] arr){
        int  length = arr.length;
        int temp=0;

        if(length%2==0){
            for(int i=0; i<length/2; i++){
                for(int j=i+1; j<=length/2; j++){
                    if(arr[i]>arr[j]){
                        temp = arr[i];
                        arr[i]= arr[j];
                        arr[j]= temp;
                    }
                }
            }
            for(int i=length/2; i<length; i++){
                for(int j=i+1; j<length; j++){
                    if(arr[i]<arr[j]){
                        temp = arr[i];
                        arr[i]= arr[j];
                        arr[j]= temp;
                    }
                }
            }
        }
        else{
            for(int i=0; i<(length-1)/2; i++){
                for(int j=i+1; j<=(length-1)/2; j++){
                    if(arr[i]>arr[j]){
                        temp = arr[i];
                        arr[i]= arr[j];
                        arr[j]= temp;
                    }
                }
            }
            for(int i=(length-1)/2; i<length; i++){
                for(int j=i+1; j<length; j++){
                    if(arr[i]<arr[j]){
                        temp = arr[i];
                        arr[i]= arr[j];
                        arr[j]= temp;
                    }
                }
            }
        }
        return arr;
    }
}

class Test3{
    public static void main(String[] args) {
        System.out.println(Arrays.toString(AscendDescendHalfArray.getSortedArray(new int[] {11,3,5,2,1,8,9,7,4,6,10})));
    }
}