package com.DaysProgramming.ILoveProgramming.CodeWars;

public class FindTheEvenPosition {

    public static void main(String[] args) {
        Integer[] numbers = new Integer[]{1, 20, 5, 30, 45, 100};
        for (int i = 2; i < numbers.length; i += 2)
            System.out.println(numbers[i]);
    }
}
