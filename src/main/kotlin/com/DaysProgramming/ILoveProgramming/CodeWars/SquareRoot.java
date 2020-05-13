package com.DaysProgramming.ILoveProgramming.CodeWars;

public class SquareRoot {
    public static void main(String[] args) {
        double input = 81;
        System.out.println(Math.sqrt(input));
        for (int i = 1; i < input / 2 + 2; i++) {
            if (input == i * i) {
                System.out.println("Perfect square...");
                return;
            }
        }
        System.out.println("Not A Perfect square...");
    }
}
