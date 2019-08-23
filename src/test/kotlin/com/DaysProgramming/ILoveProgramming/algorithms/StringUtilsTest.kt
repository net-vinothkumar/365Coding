package com.DaysProgramming.ILoveProgramming.algorithms

import org.junit.Assert.*
import org.junit.Test
import java.util.*

class StringUtilsTest {
    @Test
    fun `should return number of words in the given sentence`(){
        val stringUtils = StringUtils()
        assertEquals(2, stringUtils.findNumberOfWords("to" ,"InterviewDOT has goal to help people helping students to learn the software using tamil, all the best"))
    }

    @Test
    fun `should filter empty words from the given list of string`(){
        val stringUtils = StringUtils()
        assertEquals(listOf("John", "Scott", "Maria", "Stephen", "Philip"), stringUtils.filterNull(Arrays.asList("John", null, "Scott", null, "Maria", null, "Stephen", null, "Philip")))
    }

    @Test
    fun `should return the length of the given sentence`(){
        val stringUtils = StringUtils()
        assertEquals(59, stringUtils.lengthOfSentence("InterviewDOT will be helping 1 billion people in the world."))
    }

    @Test
    fun `should return sorted names starting with 'M' `(){
        val stringUtils = StringUtils()
        val sortedNamesWithM = stringUtils.getSortedNames(Arrays.asList("Michael", "John", "Scott", "Maria", "Stephen", "Philip", "Martin"))
        println(sortedNamesWithM)
        assertEquals(listOf("Maria", "Martin", "Michael"), sortedNamesWithM)
    }

    @Test
    fun `should return sorted strings`(){
        val stringUtils = StringUtils()
        assertEquals(listOf("AWS", "Java", "Learn", "Share", "Kotlin", "InterviewDOT"), stringUtils.sort(listOf("InterviewDOT", "AWS", "Java", "Kotlin", "Learn", "Share")))
    }
}