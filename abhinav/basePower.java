package com.abhinav;

import java.util.Scanner;

public class basePower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base,power,result = 1;

        System.out.print("Enter base = ");
        base = sc.nextInt();

        System.out.print("Enter power = ");
        power = sc.nextInt();

        for (int i = 0; i<=power; i++){
            result *= base;
        }
        System.out.println("Result : "+result);
    }
}
