package com.abhinav;

import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;

        while(i <= n) {
           int j = 1;
           while (j <= i){
               System.out.print("* ");
               j++;
        }
           System.out.println();
           i++;

        //for loop
//        for (int i=n; i>0; i--){
//            for(int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");


        // while loop


       }
    }
}