package com.DaysProgramming.ILoveProgramming.CodeWars;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;

public class AlternativeCharacterChange {
    public static void main(String[] args) {
        String input = "HeLlO WoRlD";
        System.out.println(alter(input));
        System.out.println(alterUsingStreams(input));
    }

    private static String alterUsingStreams(String input) {
        return input.chars()
                .map(c -> c + (isLowerCase(c) ? -32 : isUpperCase(c) ? 32 : 0))
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    private static String alter(String input) {
        char[] characters = input.toCharArray();
        StringBuilder result = new StringBuilder();
        for (char character : characters) {
            if (isUpperCase(character)) {
                result.append(Character.toLowerCase(character));
            } else {
                result.append(Character.toUpperCase(character));
            }
        }
        return result.toString();
    }
}
