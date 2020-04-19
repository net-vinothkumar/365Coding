package com.DaysProgramming.ILoveProgramming.CrackCoding;

public class Palindrome {
    public static void main(String[] args) {
        int x = 1111;
        Boolean result = isPalindrome(x);
        System.out.println(result);
    }

    private static Boolean isPalindrome(int number) {
        if (number == 0) {
            return true;
        }

        if (number < 0) {
            return false;
        }

        int reversed_int = 0;
        while (number > reversed_int) {
            int pop = number % 10;
            number /= 10;

            reversed_int = (reversed_int * 10) + pop;
        }

        return number == reversed_int || number == reversed_int / 10;
    }
}
