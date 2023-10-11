package com.abhinav;

public class reverseArray {
    public static void main(String[] args) {
        // Create an array with some initial values
        int[] arr = {78, 56, 78, 65, 99};

        // Get the length of the array (number of elements)
        int l = arr.length;

        // Calculate the midpoint of the array
        int n = l / 2;

        int temp; // Temporary variable for swapping

        // Loop to reverse the array
        for (int i = 0; i < n; i++) {
            // Swap the elements at positions 'i' and 'l - i - 1'
            temp = arr[i];                     // Store the value at position 'i' in 'temp'
            arr[i] = arr[l - i - 1];           // Replace 'arr[i]' with the value at position 'l - i - 1'
            arr[l - i - 1] = temp;             // Replace the value at position 'l - i - 1' with 'temp'
        }

        // Print the reversed array
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
