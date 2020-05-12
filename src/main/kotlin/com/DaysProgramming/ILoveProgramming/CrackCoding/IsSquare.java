package com.DaysProgramming.ILoveProgramming.CrackCoding;

public class IsSquare {
    public static void main(String[] args) {
        System.out.println("3 * 3 = " + isSquare(9));
        System.out.println("4 * 4 = " + isSquare(16));
        System.out.println("5 * 5 = " + isSquare(25));
        System.out.println("4 * 5 = " + isSquare(20));
    }

    private static Boolean isSquare(int number) {
        for (int i = 0; i < number / 2 + 2; i++) {
            if (i * i == number) {
                return true;
            }
        }
        return false;
    }
}
