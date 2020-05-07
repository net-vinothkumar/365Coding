package com.DaysProgramming.ILoveProgramming.CrackCoding;

public class Equal {
    public static void main(String[] args) {
        String stringOne = "Java";
        String[] stringTwo = {"J", "a", "v", "a"};
        StringBuilder str3 = new StringBuilder();
        for (String str : stringTwo) {
            str3.append(str);
        }
        boolean b1 = (stringOne == str3.toString());
        boolean b2 = (stringOne.equals(str3.toString()));
        System.out.print(b1 + ", " + b2);
    }
}

