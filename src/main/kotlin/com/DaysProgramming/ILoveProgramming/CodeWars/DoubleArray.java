package com.DaysProgramming.ILoveProgramming.CodeWars;

import java.util.stream.IntStream;

public class DoubleArray {
    public static void main(String[] args) {
        int[] intArray = new int[]{1, 2, 3, 4, 5};
        IntStream.of(intArray)
                .map(number -> number * 2)
                .filter(number -> number > 5)
                .forEach(System.out::println);
    }
}
