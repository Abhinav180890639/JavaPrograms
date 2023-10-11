package com.abhinav;

import java.util.Scanner;

public class reverseMultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        for (int i = 10; i > 0; i--){
            int mul = n*i;
            System.out.println(n+" x "+i+" = "+mul);
        }
    }
}
