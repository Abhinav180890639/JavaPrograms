package com.abhinav;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int fact = 1;
        int i = 1;
//        for (int i = 1; i <= n; i++){        //for loop
//            fact *= i;
//        }

        //while Loop
        while (i <= n) {
            fact = fact*i;
            i++;
        }
        System.out.println("Factorial = " + fact);
    }
}
