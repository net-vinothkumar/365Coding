package com.DaysProgramming.ILoveProgramming.CrackCoding;

public class Reverse {
    public static void main(String[] args) {
        int number = 123;
        int result = reverseNumber(number);
        System.out.println(result);
    }

    private static int reverseNumber(int number) {
        int reversed = 0;
        int pop;

        while (number != 0) {
            pop = number % 10;
            number /= 10;
            if (reversed > Integer.MAX_VALUE / 10 || reversed == Integer.MAX_VALUE / 10 && pop > 7) {
                return 0;
            }
            if (reversed < Integer.MIN_VALUE / 10 || reversed == Integer.MIN_VALUE / 10 && pop < -8) {
                return 0;
            }
            reversed = (reversed * 10) + pop;
        }
        return reversed;
    }
}
