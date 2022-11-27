package com.cb.yash.array_string;

public class LCM_HCF_Of_Array {

    public static void getLcmOfArrays(int array[]){
        int lcm = array[0];
        int gcd = array[0];

        for(int i=1; i<array.length; i++){
            gcd = findGCD(array[i], lcm);
            lcm = (lcm*array[i])/gcd;
        }

        System.out.println("LCM: "+lcm);
    }

    //recursive function to find GCD of two numbers
    public static int findGCD(int a, int b){
        //base condition
        if(b == 0)
            return a;

        return findGCD(b, a%b);
    }

    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    // Function to find gcd of array of
    // numbers
    static int findGCD(int arr[], int n)
    {
        int result = arr[0];
        for (int element: arr){
            result = gcd(result, element);

            if(result == 1)
            {
                return 1;
            }
        }

        return result;
    }
}

class LCM_HCF_Test{
    public static void main(String[] args) {
        LCM_HCF_Of_Array.getLcmOfArrays(new int[]{3,4,5});
        int arr[] = { 2, 4, 6, 8, 16 };
        int n = arr.length;
        System.out.println(LCM_HCF_Of_Array.findGCD(arr, n));
    }
}
