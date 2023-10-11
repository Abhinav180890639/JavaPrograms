package com.abhinav;

import java.util.Scanner;

public class startToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start number : ");
        int start = sc.nextInt();
        System.out.print("Enter second number : ");
        int end = sc.nextInt();
        for (int i = start; i <= end; i++){
            System.out.println(i);
        }
    }
}
