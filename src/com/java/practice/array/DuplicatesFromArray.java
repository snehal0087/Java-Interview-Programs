package com.java.practice.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Java program to remove duplicate elements from an array
 */
public class DuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 1, 7, 2, 4, 2};
        System.out.println("Given Array : " + Arrays.toString(arr));

        //Solution-1 : using hashmap
        Map<Integer, Boolean> elementMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {

            if (elementMap.get(arr[i]) == null) {
                elementMap.put(arr[i], true);
            }
        }
        Object[] uniqueArray = elementMap.keySet().toArray();
        System.out.println("Unique Array : " + Arrays.toString(uniqueArray));
    }
}
