package com.cb.yash.Exception.task2;

public class Child extends Parent{
    @Override
    public int getBigFromArray(int[] arr)throws NumberFormatException,
                                                    NullPointerException{
        int length = arr.length;
        int temp=0;
        int sum=0;
        if(arr==null)
            throw new NullPointerException("please dont pass null array");

        for (int i=0; i<length; i++){
           if(arr[i]<0)
               throw new NumberFormatException("please pass only positive number");
            for(int j=0; j<length; j++){
                if(arr[i]<arr[j]){
                    temp  = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for (int i: arr){
            sum=sum+i;
        }

        System.out.println("Average of array is:\t"+ sum/length);

        return arr[length-1];
    }
}
