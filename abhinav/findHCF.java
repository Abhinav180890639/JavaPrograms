package com.abhinav;

import java.util.Scanner;

public class findHCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number : ");
        int num2 = sc.nextInt();

        int hcf = findHcf(num1,num2);
        System.out.println("The HCF of "+num1+" and "+num2+" is: "+hcf);
    }

    public static int findHcf(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}