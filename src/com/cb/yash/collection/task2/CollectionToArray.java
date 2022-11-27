package com.cb.yash.collection.task2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CollectionToArray {
    static Scanner scanner;
    public static void convertCollectionInArray(List<Integer> list){
        int size = list.size();
        int [] arr = new int[size];

        for(int i=0; i<size; i++){
            arr[i] = list.get(i);
        }
        System.out.println("Enter element to be searched from collection:\t");
        scanner = new Scanner(System.in);
        int element = scanner.nextInt();
        System.out.println(Arrays.toString(arr));
        binarySearch(arr, element);
    }

    static void binarySearch(int [] arr, int To_Find)
    {
        int lo = 0, hi = arr.length - 1;
        // This below check covers all cases , so need to check
        // for mid=lo-(hi-lo)/2
        while (hi - lo > 1) {
            int mid = (hi + lo) / 2;
            if (arr[mid] < To_Find) {
                lo = mid + 1;
            }
            else {
                hi = mid;
            }
        }
        if (arr[lo] == To_Find) {
            System.out.println("Found At Index " + lo );
        }
        else if (arr[hi] == To_Find) {
            System.out.println("Found At Index " + hi );
        }
        else {
            System.out.println("Not Found" );
        }
    }
}


