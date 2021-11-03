package com.java.practice.string;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Java program to count each word frequency from given sentence.
 */
public class CountWordFrequency {

    public static void main(String[] args) {
        String str = "Hello this is my first java program and I hope it is awesome java program";
        System.out.println("Sentence : " + str);
        Map<String, Long> wordMap = Arrays.asList(str.split(" "))
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Word frequency : " + wordMap);
    }
}
