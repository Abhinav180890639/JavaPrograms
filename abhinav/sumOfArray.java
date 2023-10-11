package com.abhinav;

public class sumOfArray {
    public static void main(String[] args) {
        float [] arr = {14.5f, 78.9f, 52.5f, 21.6f, 89.2f};
        float sum = 0;
        for (float num: arr){
            sum = sum + num;
        }
        System.out.println("Sum = "+sum);
    }
}
