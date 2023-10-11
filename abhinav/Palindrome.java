package com.abhinav;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        int length = str.length();
        String reverseStr = "";

        for (int i = (str.length() - 1); i >= 0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }

        if (str.equals(reverseStr)){
            System.out.println("It is  Palindrome");
        }else {
            System.out.println("It is not Palindrome");
        }
    }
}
