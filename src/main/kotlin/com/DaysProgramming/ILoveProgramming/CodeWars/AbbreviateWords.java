package com.DaysProgramming.ILoveProgramming.CodeWars;

// split words
// pick the first character from the tokens
// then append with .

import java.util.Arrays;
import java.util.stream.Collectors;

public class AbbreviateWords {
    public static void main(String[] args) {
        String input = "Let's Make Technology Simple";
        String result = Arrays.stream(input.split(" "))
                .map(String::toUpperCase)
                .map(token -> token.substring(0, 1))
                .collect(Collectors.joining("."));
        System.out.println(result);
    }
}
