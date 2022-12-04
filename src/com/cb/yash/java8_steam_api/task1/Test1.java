package com.cb.yash.java8_steam_api.task1;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("please enter any number to check is palindrome or not:\t");
        int number = scn.nextInt();
        System.out.println(CheckPalindrome.isPalindrome(number));
    }
}
