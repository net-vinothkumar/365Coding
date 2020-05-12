package com.DaysProgramming.ILoveProgramming.CodeWars;

import static java.util.Arrays.asList;

/*
Output :
"found the needle at position 5"
*/
public class FindTheNeedle {
    public static void main(String[] args) {
        String[] junks = new String[]{"hay", "junk", "hay", "hay", "moreJunk", "old milk", "needle", "randomJunk"};
        System.out.println(findTheNeedle(junks));
        System.out.println(findTheNeedleUsingAsListAPI(junks));
    }

    private static String findTheNeedleUsingAsListAPI(String[] junks) {
        return "found the needle at position " + asList(junks).indexOf("needle");
    }

    private static String findTheNeedle(String[] junks) {
        for (int i = 0; i < junks.length; i++)
            if (junks[i].equals("needle")) {
                return "found the needle at position " + i;
            }
        return "needle not found";
    }
}
