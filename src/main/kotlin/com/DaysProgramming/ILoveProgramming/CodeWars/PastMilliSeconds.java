package com.DaysProgramming.ILoveProgramming.CodeWars;

public class PastMilliSeconds {
    public static void main(String[] args) {
        System.out.println(past(0, 1, 1));
    }

    private static int past(int hours, int minutes, int seconds) {
        return ((hours * 3600) + (minutes * 60) + (seconds)) * 1000;
    }
}
