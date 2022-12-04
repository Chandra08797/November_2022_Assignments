package com.cb.yash.java8_steam_api.task1;

import java.util.stream.IntStream;

public class CheckPalindrome {
    public static String isPalindrome(int number){
        String isPalindrome = String.valueOf(number);
        boolean b = IntStream.range(0, isPalindrome.length() / 2)
                .noneMatch(i -> isPalindrome.charAt(i) != isPalindrome.charAt(isPalindrome.length() - i - 1));
        return b?"this is palindrome":"this is not palindrome";
    }
}
