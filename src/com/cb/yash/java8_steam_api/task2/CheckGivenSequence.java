package com.cb.yash.java8_steam_api.task2;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CheckGivenSequence {
    public static String checkGivenStringSequence(String sentence, String pattern){

        /*first we converted passed string to string object using
        * sentence.split method it will return array of string the
        * we make stream of that string array using Stream.of
        * then we collected every first */


    String result= "";

        String newString = Stream.of(Stream.of(sentence.split(" "))
                        .map(e -> e.charAt(0))
                        .map(String::valueOf)
                        .collect(Collectors.joining()))
                .map(string -> new StringBuilder(string).reverse())
                .collect(Collectors.joining());

        for (int i = 0; i < newString.length(); i++) {
            if (i % 2 == 1)
                continue;
           result+=newString.charAt(i);
        }

        return result.equalsIgnoreCase(pattern)?"String is found and matched with pattern":"String not found";
    }
}

                /*this was just for testing*/

/*  boolean matches = Stream.of(Stream.of(sentence.split(" "))
                        .
                        .map(e -> e.charAt(0))
                        .map(String::valueOf)
                        .collect(Collectors.joining()))
                .map(string -> new StringBuilder(string).reverse())
                .collect(Collectors.joining()).matches(pattern);*/