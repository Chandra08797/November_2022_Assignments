package com.cb.yash.java8_steam_api.test3;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("how much number you want to enter");
        int length = scanner.nextInt();
        int[] arr = new int[length];
        System.out.println("enter "+ length +" numbers");
        for(int i=0; i<arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        CheckNumbers.checkNumbers(arr);
    }
}
