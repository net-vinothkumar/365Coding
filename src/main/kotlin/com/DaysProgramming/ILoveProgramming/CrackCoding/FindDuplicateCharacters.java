package com.DaysProgramming.ILoveProgramming.CrackCoding;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharacters {
    public static void main(String[] args) {
        printCharacters("Programming");
    }

    private static void printCharacters(String input) {
        Map<Character, Integer> characterCount = new HashMap<>();

        for (Character character : input.toCharArray()) {
            if (characterCount.containsKey(character)) {
                characterCount.put(character, characterCount.get(character) + 1);
            } else {
                characterCount.put(character, 1);
            }
        }

        Set<Map.Entry<Character, Integer>> entrySet = characterCount.entrySet();
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
            }
        }
    }
}
