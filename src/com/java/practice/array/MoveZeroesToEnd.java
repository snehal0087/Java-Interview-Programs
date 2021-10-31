package com.java.practice.array;

import java.util.Arrays;

/**
 * Java program to move all zeroes to the end of array in single iteration
 */
public class MoveZeroesToEnd {

    public static void main(String[] args) {
        int arr[] = {1, 0, 8, 0, 0, 2, 0, 4, 5, 0, 3};
        System.out.println(Arrays.toString(arr));
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
                count++;

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
