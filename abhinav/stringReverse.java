package com.abhinav;

import java.util.Scanner;

public class stringReverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String originalString = sc.nextLine();
        String reverseStr = " ";

        for (int i = 0; i < originalString.length(); i++){
            reverseStr = originalString.charAt(i)+reverseStr;
        }
        System.out.println(reverseStr);
    }

}
