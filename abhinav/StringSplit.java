package com.abhinav;

import java.util.Objects;
import java.util.Scanner;

public class StringSplit {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();

        String a = s.replaceAll("[^a-zA-Z0-9]+", " ").trim();
        String[] arr = a.split(" ");
        if (Objects.equals(arr[0],"")){
            System.out.println(0);
        }else {
            System.out.println(arr.length);
        }
            for (String arr1 : arr) {
                System.out.println(arr1);
            }

            scan.close();
    }
}


