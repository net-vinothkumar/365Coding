package com.DaysProgramming.ILoveProgramming.CodeWars;

public class StringCount {
    public static void main(String[] args) {
        System.out.println(getStringCount("Hello Subscribers ! I Love Programming", 'o'));
        System.out.println(getStringCountUsingStreams("Hello Subscribers ! I Love Programming", 'o'));
    }

    private static long getStringCountUsingStreams(String source, char element) {
        return source
                .chars()
                .filter(character -> character == element)
                .count();
    }

    private static int getStringCount(String source, char element) {
        char[] characters = source.toCharArray();
        int count = 0;
        for (char character : characters) {
            if (character == element) {
                count++;
            }
        }
        return count;
    }
}
