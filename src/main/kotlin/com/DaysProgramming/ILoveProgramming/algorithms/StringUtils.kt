package com.DaysProgramming.ILoveProgramming.algorithms

import java.util.*
import java.util.stream.Collectors
import java.util.stream.IntStream


class StringUtils {
    fun findNumberOfWords(wordToFind: String, sentence: String): Int {
        var count = 0
        sentence.split(" ").stream().forEach { token ->
            run {
                if (token == wordToFind) {
                    count++
                }
            }
        }
        return count
    }

    fun filterNull(listOfNames: List<String?>): List<String?>? {
        return listOfNames.stream().filter(Objects::nonNull).collect(Collectors.toList())
    }

    fun lengthOfSentence(sentence: String): Int {
        println(IntStream.range(1, 10).reduce { a, b -> a + b }.asInt)

        return sentence.length
    }

    fun getSortedNames(names: List<String>): List<String> {
        return names
                .stream()
                .sorted()
                .filter { s -> s.startsWith("M", true) }
                .collect(Collectors.toList())
    }

    fun sort(strings: List<String>): List<String> {
        return strings
                .stream()
                .sorted { str1, str2 ->
                    Integer.compare(str1.length, str2.length)
                }
                .collect(Collectors.toList())
    }
}