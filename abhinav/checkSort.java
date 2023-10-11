package com.abhinav;

public class checkSort {
    public static void main(String[] args) {
        boolean isSorted = true;
        int[] arr = {78,66,31,46,29};

        for (int i=0; i< arr.length; i++){
            if (arr[i]>arr[i+1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }
    }
}
