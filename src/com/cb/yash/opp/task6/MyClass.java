package com.cb.yash.opp.task6;

public class MyClass implements NumberOperation{

    @Override
    public int getBigNum(int a, int b) {
        return a>b ? a: b;
    }

    @Override
    public int getBigNum(int[] arr) {
        int length = arr.length;
        int temp;

        for(int i=0; i<length; i++){
            for(int j=0; j<length; j++){
                if(arr[i]<arr[j]){
                    temp   = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[length-1];
    }
}
