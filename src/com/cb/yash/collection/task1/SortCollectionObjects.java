package com.cb.yash.collection.task1;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortCollectionObjects {
    static int choice;
    static Scanner scanner = new Scanner(System.in);
    public static List<?> sortCollectionObjects(List<Integer> list){
        System.out.println("Please enter your choice\n");
        System.out.println("::press 1 for sorting in Ascending Order\n");
        System.out.println("::press 2 for sorting in Descending Order\n");
        choice = scanner.nextInt();

        switch (choice){
            case 1:
                return list.stream().sorted().collect(Collectors.toList());
            case 2:
                return list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
            default:
                System.out.println("please enter valid choice\n "+"\ncollect your old list");
                return list;
        }
    }
}
