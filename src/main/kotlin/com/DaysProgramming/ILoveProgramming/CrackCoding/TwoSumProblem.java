package com.DaysProgramming.ILoveProgramming.CrackCoding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1]
 */
public class TwoSumProblem {

    public static void main(String[] args) throws Exception {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 18;
        int[] result = bruteForceMethod(nums, target);
        Arrays.stream(result).forEach(System.out::println);
        Integer[] resultUsingMap = twoSumProblemUsingMap(nums, target);
        Arrays.stream(resultUsingMap).forEach(System.out::println);
    }

    private static Integer[] twoSumProblemUsingMap(int[] nums, int target) throws Exception {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (Integer i = 0; i < nums.length; i++) {
            int numToFind = target - nums[i];

            if (map.containsKey(numToFind) && map.get(numToFind) != i) {
                return new Integer[]{i, map.get(numToFind)};
            }
        }

        throw new Exception("No two sum pair found.");
    }

    private static int[] bruteForceMethod(int[] nums, int target) throws Exception {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == (target - nums[i])) {
                    return new int[]{i, j};
                }
            }
        }

        throw new Exception("no two sum pair found.");
    }
}
