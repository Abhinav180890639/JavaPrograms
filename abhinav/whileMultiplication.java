package com.abhinav;

import java.util.Scanner;

public class whileMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int i = 1;
        while (i <= 10) {
            int result = i*n;
            System.out.println(n+" X "+i+" = "+result);
            i++;
        }
    }
}
