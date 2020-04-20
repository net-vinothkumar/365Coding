package com.DaysProgramming.ILoveProgramming.CrackCoding;

public class MaxSumInArray {

    public static void main(String[] args) {
        int[] numbers = new int[]{2, 3, -6, -1, 2, -1, 6, 4, -8, 8};
        System.out.println(findMaxSum(numbers));
    }

    private static int findMaxSum(int[] numbers) {
        int sum = 0;
        int maxSum = 0;

        for (int i = 0; i <= numbers.length - 1; i++) {
            sum += numbers[i];
            if (sum > maxSum) {
                maxSum = sum;
            } else if (sum < 0) {
                sum = 0;
            }
        }
        return sum;
    }
}
