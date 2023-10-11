package com.abhinav;
public class multiplicationTable {
    public multiplicationTable(int n){
        for(int i = 1;i <= n; i++){
            int mul = n * i;
            System.out.println(n+" * "+i+" = "+mul);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        multiplicationTable table = new multiplicationTable(n);
    }
}





