package com.cb.yash.array_string;

import java.util.Arrays;

public class CheckNumbers {

    public static void checkEOPPInArrays(int[] arr){
        int length = arr.length;
        int[] prime   = new int[length];
        int[] even    = new int[length];
        int[] odd     = new int[length];
        int[] perfect = new int[length];
        int count=0;
        int eElements=0;
        int oElements=0;
        int pElements=0;
        int perElements=0;
        int sum=0;

        for(int i=0; i<length; i++){
            if(arr[i]%2==0){
                even[eElements++] = arr[i];

               if(arr[i]>1){
                   for(int j=1; j<=arr[i]/2; j++){
                       if(arr[i]%j==0){
                           sum = sum + j;
                       }
                   }
                   if(sum == arr[i]){
                       perfect[perElements++] = arr[i];
                   }
               }
               sum=0;
            }

            else{
                odd[oElements++]=arr[i];

               if(arr[i]>1){
                   for(int j=2; j<arr[i]; j++){
                       if(arr[i]%j == 0){
                           count++;
                           break;
                       }
                   }
                   if (count==0){
                       prime[pElements++]=arr[i];
                   }
                   else{
                       count=0;
                   }
               }
            }
        }
        System.out.println("even numbers are:\t" +Arrays.toString(even));
        System.out.println("odd numbers are:\t"+ Arrays.toString(odd));
        System.out.println("prime numbers are:\t" +Arrays.toString(prime));
        System.out.println("perfect numbers are:\t" +Arrays.toString(perfect));
    }
}

class Test1{
    public static void main(String[] args) {
        CheckNumbers.checkEOPPInArrays(new int[]{3,6,4,8,10,12,14,16,18,191,20,25,28,27,49,39,19,});
    }
}
