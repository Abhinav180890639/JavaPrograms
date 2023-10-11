package com.abhinav;

import java.util.Scanner;

public class findInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] arr = {78.2f, 54.3f, 35.4f, 55.8f, 48.6f};
        float num = 78.2f;
        boolean isInArray = false;
        for ( float element: arr) {
            if (num == element){
                isInArray = true;
                break;
            }
        }
        if (isInArray){
            System.out.println("Element found");
        }else {
            System.out.println("Element not found");
        }
    }
}
