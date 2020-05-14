package com.DaysProgramming.ILoveProgramming.CodeWars;

public class AgeRangeCompatible {
    public static void main(String[] args) {
        System.out.println(calculateAgeRange(27));
        System.out.println(calculateAgeRange(30));
        System.out.println(calculateAgeRange(4));
        System.out.println(calculateAgeRange(16));
        System.out.println(calculateAgeRange(18));
    }

    private static String calculateAgeRange(int age) {
        return age > 14 ? age / 2 + 7 + "-" + (age - 7) * 2 : (int) (.9 * age) + "-" + (int) (1.1 * age);
    }
}
