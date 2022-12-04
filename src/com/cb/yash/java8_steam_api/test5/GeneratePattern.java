package com.cb.yash.java8_steam_api.test5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GeneratePattern {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        generatePattern('f');
    }
    public static void generatePattern(char c){
        int limit = (int)Character.toUpperCase(c);
        System.out.println(limit);
        Stream.iterate(65, A->A+1)
                .map(e-> (char)(int)e)
                .limit(limit)
                .forEach(System.out::print);
    }

    public static void generateSeries(int[] arr){
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        int count =1;
        for(int i=0; i<list.size(); i++){
            if(i==0||i==3){
                System.out.print(list.get(i)+"-");
            }

            if(i==4 || i==6){
                System.out.print(list.get(i)+"-");
            }

            if(i==7){
                System.out.print(list.get(i)+"-");
            }

            if(i==8||i==10){
                System.out.print(list.get(i)+"-");
            }

            if(i==11||i==13){
                System.out.print(list.get(i)+"-");
            }
        }
    }
}
