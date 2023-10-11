package com.abhinav;

import java.util.Scanner;

public class matrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int columns = sc.nextInt();

        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];
        int[][] resultMatrix = new int[rows][columns];

        System.out.println("Enter the values of matrix 1 : ");
        for (int i = 0; i<rows; i++){
            for (int j = 0; j < columns; j++){
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter values for matrix 2 : ");
        for (int i = 0; i <rows; i++){
            for (int j = 0;j < columns; j++){
                matrix2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i<rows; i++){
            for (int j = 0; j<columns; j++){
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Resultant matrix after addition : ");
        for (int i = 0; i<rows; i++){
            for (int j = 0;j < columns; j++){
                System.out.print(resultMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
