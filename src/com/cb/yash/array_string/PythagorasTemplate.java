package com.cb.yash.array_string;

import java.util.Arrays;

public class PythagorasTemplate {

    public static int[] pythagorasTemp(int[] arr){
        int length = arr.length;
        int [] pythagorasElements=new int[length];
        int temp=0;

        for(int i=0; i<length;i++){
            for(int j=0; j<length; j++){
                if(arr[i]<arr[j]){
                   temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
                }
            }
        }

        for(int i=0; i<length-2; i++){
            if((arr[i+2]*arr[i+2])==((arr[i]*arr[i])+(arr[i+1]*arr[i+1]))){
                pythagorasElements[i]=arr[i];
                pythagorasElements[i+1]=arr[i+1];
                pythagorasElements[i+2]=arr[i+2];
            }
        }
        return pythagorasElements;
    }
}

class Test{
    public static void main(String[] args) {
        System.out.println(Arrays.toString(PythagorasTemplate.pythagorasTemp(new int[]{1,6,7,10,2,3,8,9,4,5})));
    }
}
