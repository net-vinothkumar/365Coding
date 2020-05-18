package com.DaysProgramming.ILoveProgramming.CodeWars;

import java.util.Arrays;

public class ReduceArray {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4};
        System.out.println(Arrays.stream(numbers)
                .reduce(1, (a, b) -> a * b));
    }
}
