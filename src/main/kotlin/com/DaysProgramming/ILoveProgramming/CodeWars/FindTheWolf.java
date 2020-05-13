package com.DaysProgramming.ILoveProgramming.CodeWars;


import java.util.Arrays;

public class FindTheWolf {
    public static void main(String[] args) {
        String[] herd = new String[]{"sheep", "sheep", "sheep", "sheep", "wolf"};
        int indexOfWolf = Arrays.asList(herd).indexOf("Wolf") + 1;
        System.out.println(indexOfWolf == herd.length ? "Pls go away and stop eating my sheep" : "Oi! Sheep number " + (herd.length - indexOfWolf) + "! You are about to be eaten by a wolf!");
    }
}
