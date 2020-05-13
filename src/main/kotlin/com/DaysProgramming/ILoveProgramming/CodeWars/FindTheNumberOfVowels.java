package com.DaysProgramming.ILoveProgramming.CodeWars;

import java.util.HashMap;
import java.util.Map;

public class FindTheNumberOfVowels {
    public static void main(String[] args) {
        String input = "I Love Programming A Lot, Do you as well ?";
        Map<Character, Integer> vowelsCount = getVowelsMap();
        for (Character character : input.toLowerCase().toCharArray()) {
            if (vowelsCount.containsKey(character)) {
                vowelsCount.put(character, vowelsCount.get(character) + 1);
            }
        }
        vowelsCount.forEach((k, v) -> System.out.println("Count = " + k + "  =  " + v.longValue()));
    }

    private static Map<Character, Integer> getVowelsMap() {
        Map<Character, Integer> vowelsMap = new HashMap<>();
        vowelsMap.put('a', 0);
        vowelsMap.put('e', 0);
        vowelsMap.put('i', 0);
        vowelsMap.put('o', 0);
        vowelsMap.put('u', 0);
        return vowelsMap;
    }
}
