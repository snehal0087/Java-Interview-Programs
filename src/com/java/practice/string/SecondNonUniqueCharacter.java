package com.java.practice.string;

import java.util.Arrays;

/**
 * Write Java program to find second non-unique character from given string.
 */
public class SecondNonUniqueCharacter {
    public static void main(String[] args) {
        String str = "Java";
        String secondNonUniqueChar = Arrays.stream(str.split(""))
                .filter(ch -> str.indexOf(ch) == str.lastIndexOf(ch))
                .skip(1)
                .findAny()
                .get();

        System.out.println(secondNonUniqueChar);
    }
}
