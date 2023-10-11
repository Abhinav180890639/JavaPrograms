package com.abhinav;

import java.util.Scanner;

public class multiplicationTableRunner {

    static void print(int n){
        for (int i = 1; i<=10; i++){
            System.out.println(n+" * "+i+" = "+i*n);
        }
    }
    public static void main(String[] args) {
        System.out.println("Table : \n");
        print(7);
    }
}
