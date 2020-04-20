package com.DaysProgramming.ILoveProgramming.CrackCoding;

public class StringReverse {

    public static void main(String[] args) {
        String input = "Hello";
        System.out.println(reverseTheString(input));
        System.out.println(reverseTheStringUsingSwapping(input.toCharArray()));
    }

    private static String reverseTheStringUsingSwapping(char[] input) {
        int a_pointer = 0;
        int b_pointer = input.length - 1;

        while (a_pointer <= b_pointer) {
            char temp = input[a_pointer];
            input[a_pointer] = input[b_pointer];
            input[b_pointer] = temp;

            a_pointer++;
            b_pointer--;
        }

        return new String(input);
    }

    private static String reverseTheString(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            result.append(input.charAt(i));
        }
        return result.toString();
    }
}
