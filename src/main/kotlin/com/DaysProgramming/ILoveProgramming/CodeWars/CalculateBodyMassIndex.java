package com.DaysProgramming.ILoveProgramming.CodeWars;

public class CalculateBodyMassIndex {
    public static void main(String[] args) {
        System.out.println(calculateBodyMassIndex(60.0, 173));
    }

    private static String calculateBodyMassIndex(double weight, int height) {
        double bodyMassIndex = weight / (height * height);
        if (bodyMassIndex <= 18.5) {
            return "Underweight";
        } else if (bodyMassIndex <= 25.0) {
            return "Normal";
        } else if (bodyMassIndex <= 30.0) {
            return "Overweight";
        }
        return "Obese";
    }
}
