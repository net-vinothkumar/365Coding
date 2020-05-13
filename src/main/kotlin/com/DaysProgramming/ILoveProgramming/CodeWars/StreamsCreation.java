package com.DaysProgramming.ILoveProgramming.CodeWars;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
1. Streams from values
2. Empty Streams
3. Streams from arrays
4. Streams from collections
5. Streams from files
6. Streams from other sources
 */
public class StreamsCreation {
    public static void main(String[] args) {
        Stream<String> streams = Stream.of("Orange", "Apple");
        streams.forEach(System.out::println);

        Stream streamsUsingBuilder = Stream.builder()
                .add("Orange")
                .add("Apple")
                .add("Banana")
                .add("Grapes")
                .build();
        streamsUsingBuilder.forEach(System.out::println);

        IntStream integers = IntStream.range(1, 10);
        integers.forEach(number -> System.out.println(number));
    }
}
