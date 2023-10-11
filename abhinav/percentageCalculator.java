package com.abhinav;

import java.util.Scanner;

public class percentageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter subject 1 marks : ");
        float s1 = sc.nextFloat();
        System.out.print("Enter subject 2 marks : ");
        float s2 = sc.nextFloat();
        System.out.print("Enter subject 3 marks : ");
        float s3 = sc.nextFloat();
        System.out.print("Enter subject 4 marks : ");
        float s4 = sc.nextFloat();
        System.out.print("Enter subject 5 marks : ");
        float s5 = sc.nextFloat();

        float sum = s1+s2+s3+s4+s5;
        float percentage = (sum/500)*100;
        float cgpa = (float)(percentage/9.5);

        System.out.println("Total marks : "+sum);
        System.out.println("Percentage = "+percentage);
        System.out.println("CGPA = "+cgpa);



    }
}
