package com.abhinav;

import java.util.Scanner;

public class sumOfEvenOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number separated by spaces = ");
        String str = sc.nextLine();

        String[] numbers = str.split(" ");

        int evenSum = 0;
        int oddSum = 0;

        for (String numStr: numbers) {
            int num = Integer.parseInt(numStr);
            if (num % 2 == 0){
                evenSum = evenSum + num;
            }else {
                oddSum = oddSum + num;
            }
        }
        System.out.println("Sum of even integers = "+evenSum);
        System.out.println("Sum of odd integers = "+oddSum);
    }
}
