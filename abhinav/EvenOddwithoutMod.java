package com.abhinav;

import java.util.Scanner;

public class EvenOddwithoutMod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isEven(n)){
            System.out.println(n+" is even");
        }else{
            System.out.println(n+" is odd");
        }
    }


    public static boolean isEven(int n){
        return (n & 1) == 0;
    }
}
