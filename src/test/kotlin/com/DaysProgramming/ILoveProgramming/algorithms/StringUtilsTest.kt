package com.DaysProgramming.ILoveProgramming.algorithms

import org.junit.Assert.*
import org.junit.Test
import java.util.*

class StringUtilsTest {
    @Test
    fun `should return number of words in a sentence`(){
        val stringUtils = StringUtils()
        assertEquals(2, stringUtils.findNumberOfWords("to" ,"InterviewDOT has goal to help people helping students to learn the software using tamil, all the best"))
    }

    @Test
    fun `should filter null from the given list of string`(){
        val stringUtils = StringUtils()
        assertEquals(listOf("John", "Scott", "Maria", "Stephen", "Philip"), stringUtils.filterNull(Arrays.asList("John", null, "Scott", null, "Maria", null, "Stephen", null, "Philip")))
    }
}