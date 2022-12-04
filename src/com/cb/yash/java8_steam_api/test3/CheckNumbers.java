package com.cb.yash.java8_steam_api.test3;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CheckNumbers {

    public static void checkNumbers(int[] arr){
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Scanner scanner = new Scanner(System.in);
        System.out.println("please select your choice");

        System.out.println("1- for checking even number in given\t\t\t\t2- for checking odd numbers in given"+
                            "\n3- for checking palindrome numbers\t\t\t\t\t4- for checking armstrong numbers");

        int choice = scanner.nextInt();
        switch (choice){
            case 1:{
                System.out.println("Even numbers are in this list are:\t\n");
                list.stream().filter(e -> e % 2 == 0)
                        .collect(Collectors
                                .toList())
                        .forEach(System.out::println);
                break;
            }

            case 2:{
                System.out.println("Odd numbers are in this list are:\t\n");
                list.stream().filter(e -> e % 2 != 0)
                        .collect(Collectors
                                .toList())
                        .forEach(System.out::println);
                break;
            }

            case 3:{
                System.out.println("palindrome numbers are in this list are:\t\n");
                list.stream().filter((e)->{
                                int temp=e;
                                int r,sum=0;
                                while(e>0){
                                    r=e%10;  //getting remainder
                                    sum=(sum*10)+r;
                                    e=e/10;
                                }
                                return sum == temp;
                            })
                        .collect(Collectors.toList())
                        .forEach(System.out::println);
                break;
            }

            case 4:{
                System.out.println("armstrong numbers are in this list are:\t\n");
                list.stream().filter((e)->{
                                int c = 0, temp = e;
                                while (temp > 0) {
                                    c += Math.pow(temp % 10, Integer.toString(e).length());
                                    temp /= 10;
                                }
                                return c == e;
                               })
                        .collect(Collectors.toList())
                        .forEach(System.out::println);
                break;
            }
            default:{
                System.out.println("please enter valid number");
            }
        }

    }

}
