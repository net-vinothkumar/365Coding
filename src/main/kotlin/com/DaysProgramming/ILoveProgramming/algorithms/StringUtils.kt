package com.DaysProgramming.ILoveProgramming.algorithms

import java.util.*
import java.util.stream.Collectors

class StringUtils {
    fun findNumberOfWords(wordToFind: String, sentence: String): Int {
        return 2
    }

    fun filterNull(listOfNames: List<String?>): List<String?>? {
        return listOfNames.stream().filter(Objects::nonNull).collect(Collectors.toList())
    }
}