package com.cb.yash.Exception.task2;

public class Parent {
    public int getBigFromArray(int[] arr)throws NullPointerException,
                                                    ArrayIndexOutOfBoundsException{
        int length = arr.length;
        int temp=0;
        if(arr==null)
            throw new NullPointerException("array can not be null");

        for (int i=0; i<length; i++){
            for(int j=0; j<length; j++){
                if(arr[i]<arr[j]){
                    temp  = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr[length-1];
    }
}
