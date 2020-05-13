package com.DaysProgramming.ILoveProgramming.CodeWars;

public class FirstDigitLastDigitSum {
    public static void main(String[] args) {
        int number = 1234;
        int lastDigit = number % 10;
        int firstDigit = getfirstDigit(number);
        System.out.println(firstDigit + lastDigit);
    }

    private static int getfirstDigit(int number) {
        int firstDigit = number;
        while (firstDigit > 10) {
            firstDigit = firstDigit/10;
        }
        return firstDigit;
    }
}
