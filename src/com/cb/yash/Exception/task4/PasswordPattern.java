package com.cb.yash.Exception.task4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PasswordPattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        User user = new User();

        System.out.println("Enter UserName");
        String userName = scn.nextLine();

        System.out.println("Enter password");
        System.out.println("Password Hint:\t \nPassword range must be between 8-14 and  at least 2 capital letters, 2 small letters, 2 digits and 2 special characters");

        String passWord= scn.nextLine();

        if (verifyPassword(passWord)){
            System.out.print(" Strong Password And Accepted");
            user.setUserName(userName);
            user.setPassWord(passWord);
        }

        else
            System.out.println("Password pattern not matched. please provide password as given above patten ");
    }

    public static boolean verifyPassword(String passWord){
        boolean hasTwoLower = false;
        int hasTwoLowerCount=0;
        boolean hasTwoUpper = false;
        int hasTwoUpperCount=0;
        boolean hasTwoDigit = false;
        int hasTwoDigitCount=0;
        boolean hasTwospecialChar = false;
        int hasTwoSpecialCharCount=0;
        boolean length = false;

        Set<Character> set = new HashSet<Character>(
                Arrays.asList('!', '@', '#', '$', '%', '^', '&',
                        '*', '(', ')', '-', '+'));
        for (char i : passWord.toCharArray())
        {
            if (Character.isLowerCase(i)) {
               hasTwoLowerCount++;
               if(hasTwoLowerCount ==2)
                   hasTwoLower = true;
            }
            if (Character.isUpperCase(i)){
                hasTwoUpperCount++;
                if(hasTwoUpperCount==2)
                    hasTwoUpper=true;
            }
            if (Character.isDigit(i)){
                hasTwoDigitCount++;
                if (hasTwoDigitCount==2)
                    hasTwoDigit=true;
            }
            if (set.contains(i)){
                hasTwoSpecialCharCount++;
                if (hasTwoSpecialCharCount==2)
                    hasTwospecialChar=true;
            }
            if(passWord.length() > 8 && passWord.length()< 14)
                length=true;
        }

        if (hasTwoDigit && hasTwoUpper && hasTwoLower && hasTwospecialChar && length)
            return true;
        else
           return false;
    }

}
