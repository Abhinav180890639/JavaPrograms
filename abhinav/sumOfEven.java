package com.abhinav;

import java.util.Scanner;

public class sumOfEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum = sum + (2*i);
        }
        System.out.println("Sum of first "+n+" even numbers is "+sum);
    }
}
