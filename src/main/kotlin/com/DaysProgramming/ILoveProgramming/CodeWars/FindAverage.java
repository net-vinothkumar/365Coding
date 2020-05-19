package com.DaysProgramming.ILoveProgramming.CodeWars;

import java.util.Arrays;

public class FindAverage {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5};
        System.out.println(findAverage(numbers));
    }

    private static double findAverage(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(0);
    }
}
