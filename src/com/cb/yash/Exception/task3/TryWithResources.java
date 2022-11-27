package com.cb.yash.Exception.task3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) throws FileNotFoundException,
                                                        IOException {
        try(BufferedReader br = new BufferedReader(new FileReader("abc.text"))){
            String line = br.readLine();
            System.out.println(line);
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
