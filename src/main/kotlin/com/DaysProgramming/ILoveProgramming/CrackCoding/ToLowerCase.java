package com.DaysProgramming.ILoveProgramming.CrackCoding;

public class ToLowerCase {
    public static void main(String[] args) {
        String result = convertToLowerCase("Hello");
        System.out.println(result);
    }

    private static String convertToLowerCase(String input) {
        StringBuilder result = new StringBuilder();
        for (Character c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append((char)(c + 32));
            } else {
                result.append((char) c);
            }
        }

        return result.toString();
    }
}
