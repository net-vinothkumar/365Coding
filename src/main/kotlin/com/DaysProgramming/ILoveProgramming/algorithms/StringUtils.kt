package com.DaysProgramming.ILoveProgramming.algorithms

import java.util.*
import java.util.stream.Collectors
import java.util.stream.IntStream


class StringUtils {
    fun findNumberOfWords(wordToFind: String, sentence: String): Int {

        val list1 = listOf<Long>(1, 2, 3)
        val list2 = listOf<Long>(4, 5, 6)
        val list3 = listOf<Long>(7, 8, 9, 10)

        val listResult = listOf(list1, list2, list3)
        val res = listResult.stream().flatMap { x -> x.stream() }.collect(Collectors.toList())
        println(res)

        return 2
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

}