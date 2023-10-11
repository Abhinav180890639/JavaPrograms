package com.abhinav;
import java.util.Scanner;

public class stringFunc {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String A = sc.next();
            String revStr = "";
            int length = A.length();

            for (int i = A.length()-1; i>=0; i--){
                revStr = revStr + revStr.charAt(i);
            }

            if (A.toLowerCase().equals(revStr.toLowerCase())){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }


        }

}

