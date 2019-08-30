package com.DaysProgramming.ILoveProgramming.algorithms

import java.util.*
import java.util.stream.Collectors
import java.util.stream.IntStream
import java.util.function.IntPredicate


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

    fun reverse(string: String): String {
        return string.reversed()
    }

    fun countVowel(string: String): Long {
        return string.chars().filter(vowel).count()
    }

    var vowel: IntPredicate = IntPredicate { t ->
        (t == 'a'.toInt() || t == 'e'.toInt() || t == 'i'.toInt() || t == 'o'.toInt() || t == 'u'.toInt()
                || t == 'A'.toInt() || t == 'E'.toInt() || t == 'I'.toInt() || t == 'O'.toInt()
                || t == 'U'.toInt())
    }
}