package com.DaysProgramming.ILoveProgramming.CrackCoding;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(5,
                13, 17, 5, 21, 13, 4, 19, 21
        );
        System.out.println(findDuplicates(numbers));
    }

    private static Set<Integer> findDuplicates(Stream<Integer> numbers) {

        HashSet set = new HashSet();

        return numbers
                .filter(n -> set.add(n) == false)
                .collect(Collectors.toSet());
    }
}
