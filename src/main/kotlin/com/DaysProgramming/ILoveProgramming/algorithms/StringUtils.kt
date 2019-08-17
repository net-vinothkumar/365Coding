package com.DaysProgramming.ILoveProgramming.algorithms

import java.util.*
import java.util.stream.Collectors
import java.util.stream.IntStream



class StringUtils {
    fun findNumberOfWords(wordToFind: String, sentence: String): Int {

        var list1 = listOf<Long>(1, 2, 3)
        var list2 = listOf<Long>(4, 5, 6)
        var list3 = listOf<Long>(7, 8, 9, 10)

        var listResult = listOf(list1, list2, list3)
        var res = listResult.stream().flatMap { x->x.stream() }.collect(Collectors.toList())
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
}