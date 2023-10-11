package com.abhinav;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int reverse = 0;
        int temp = num;
        int rem = 0;

        if (num == 0){
            System.out.println("Result = 0");
        } else if (num == 1) {
            System.out.println("Result = 1");
        }else {
            while(temp>0){
                rem = temp % 10;
                reverse = reverse * 10 + rem;
                temp /= 10;
            }
            System.out.println(rem);
        }
    }
}
