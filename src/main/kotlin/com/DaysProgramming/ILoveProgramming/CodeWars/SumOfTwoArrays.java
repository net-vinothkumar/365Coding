package com.DaysProgramming.ILoveProgramming.CodeWars;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        int[] firstArray = new int[]{1, 2, 3};
        int[] secondArray = new int[]{4, 5, 6};

        int firstArraySum = stream(firstArray).sum();
        int secondArraySum = stream(secondArray).sum();

        System.out.println(firstArraySum + secondArraySum);

        sumUsingIntStream(firstArray, secondArray);
        sumUsingConcat(firstArray, secondArray);
        sumUsingOf(firstArray, secondArray);
        sumUsingReduce(firstArray, secondArray);
    }

    private static void sumUsingReduce(int[] firstArray, int[] secondArray) {
        System.out.println(IntStream.of(firstArray)
                        .reduce(0, (a, b) -> (a + b)) +
                IntStream.of(secondArray)
                        .reduce(0, (a, b) -> (a + b)));
    }

    private static void sumUsingOf(int[] firstArray, int[] secondArray) {
        System.out.println(IntStream.of(firstArray).sum() + IntStream.of(secondArray).sum());
    }

    private static void sumUsingConcat(int[] firstArray, int[] secondArray) {
        System.out.println(IntStream.concat(stream(firstArray), stream(secondArray))
                .sum());
    }

    private static void sumUsingIntStream(int[] firstArray, int[] secondArray) {
        System.out.println(Stream.of(firstArray, secondArray)
                .flatMapToInt(Arrays::stream)
                .sum());
    }
}
