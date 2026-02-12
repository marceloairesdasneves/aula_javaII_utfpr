package org.example;

import java.io.BufferedReader;
import java.io.FileReader;

public class DtoS {
    public static void main(String[] args) {
        String s;
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))){
            while((s = br.readLine()) != null){
                System.out.println(s);
            }
        }catch (Exception exc){
            System.out.println("I/O error: " + exc);
        }
    }
}
