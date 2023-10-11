package com.abhinav;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();

        int[] marks = new int[size];

        for (int i = 0; i <size; i++){
            System.out.print("Enter marks for student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

//        int [] marks = {45,55,56,41,36};
        int avg,sum = 0;
        for (int element: marks) {
            sum = sum + element;
        }
        System.out.println("Average marks = "+sum/marks.length);
    }
}
