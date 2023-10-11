package com.abhinav;

import java.util.Scanner;

public class Hr_Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        if ( A.compareTo(B) > 0 ){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        String s1 = A.substring(0,1).toUpperCase();
        String s2 = A.substring(1);
        String s3 = B.substring(0,1).toUpperCase();
        String s4 = B.substring(1);
        String res1 = s1+s2;
        String res2 = s3+s4;
        System.out.println(res1+" "+res2);
    }
}
