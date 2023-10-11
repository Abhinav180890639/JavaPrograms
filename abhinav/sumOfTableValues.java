package com.abhinav;

import java.util.Scanner;

public class sumOfTableValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= 10 ; i++){
            int mul = n * i;
            sum = sum + (n * i);
            System.out.println(n+" x "+i+" = "+mul);
        }
        System.out.println("The sum of the results of table = "+sum);
    }
}
