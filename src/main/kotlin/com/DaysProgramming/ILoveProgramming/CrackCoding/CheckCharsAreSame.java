package com.DaysProgramming.ILoveProgramming.CrackCoding;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CheckCharsAreSame {
    public static void main(String[] args) {
        solutionOne();
        solutionTwo();
        returnMultiple('H');
    }

    private static String returnMultiple(char input) {
        return input == 'H' ? "Hello World" :
               input == 'Q' ? "Q" : null;
    }

    private static void solutionTwo() {
        String input = "xxoo";
        int xCount = (int) input.chars().mapToObj(c -> (char) c).filter(a -> Character.toLowerCase(a) == 'x').count();
        int oCount = (int) input.chars().mapToObj(c -> (char) c).filter(a -> Character.toLowerCase(a) == 'o').count();

        if (xCount == oCount) {
            System.out.println("characters are same");
        } else {
            System.out.println("characters are NOT same");
        }

    }

    private static void solutionOne() {
        String input = "xxoo";
        char[] characters = input.toCharArray();
        Boolean isCharactersEqual = false;
        Map<Character, Integer> characterMap = new HashMap<>();
        for (char character : characters) {
            if (characterMap.containsKey(character)) {
                characterMap.put(character, characterMap.get(character) + 1);
            } else {
                characterMap.put(character, 1);
            }
        }

        Integer previousValue = 0;
        Set<Map.Entry<Character, Integer>> entrySet = characterMap.entrySet();
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (previousValue != 0 && !previousValue.equals(entry.getValue())) {
                System.out.println("characters are NOT same");
                return;
            }
            previousValue = entry.getValue();
            isCharactersEqual = true;
        }

        if (isCharactersEqual) {
            System.out.println("characters are same");
        }
    }
}
