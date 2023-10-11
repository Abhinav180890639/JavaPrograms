package com.abhinav;

import java.util.Scanner;

public class string {
    public static void main(String[] args) {

                Scanner in = new Scanner(System.in);
                String S = in.next();
                int start = in.nextInt();
                int end = in.nextInt();

                for (int i = start;i <= end-1;i++){
                    System.out.print(S.charAt(i));
                }
//        System.out.println();

    }
}


