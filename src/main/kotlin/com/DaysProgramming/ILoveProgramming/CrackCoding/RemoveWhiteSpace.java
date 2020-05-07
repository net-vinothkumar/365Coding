package com.DaysProgramming.ILoveProgramming.CrackCoding;

public class RemoveWhiteSpace {
    public static void main(String[] args) {
        String stringWithSpace = "Hi How Are You ?";
        String stringWithoutSpace = stringWithSpace.replaceAll("\\s", "");
        System.out.println(stringWithoutSpace);
    }
}
