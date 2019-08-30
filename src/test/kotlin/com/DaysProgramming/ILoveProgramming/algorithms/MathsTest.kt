package com.DaysProgramming.ILoveProgramming.algorithms

import org.junit.Assert.assertEquals
import org.junit.Test

class MathsTest {
    private val maths = Maths()

    @Test
    fun `should return sum of two integers`() {
        assertEquals(0, maths.sum(0, 0))
    }

    @Test
    fun `should return 100 after adding 45 and 55`() {
        assertEquals(100, maths.sum(45, 55))
    }

    @Test
    fun `should return sum of 5 numbers using stream api`() {
        assertEquals(15, maths.sumUsingStreamAPI(listOf(1, 2, 3, 4, 5)))
    }

    @Test
    fun `should return sorted number using stream api`() {
        assertEquals(listOf(1, 2, 3, 4, 5), maths.sortNumbersUsingStreamAPI(listOf(5, 3, 1, 4, 2)))
    }

    @Test
    fun `should return difference of two numbers`() {
        assertEquals(279, maths.difference(1045, 766))
    }

    @Test
    fun `should return distinct sorted numbers`() {
        assertEquals(listOf(0, 5, 13, 19), maths.distinctSorted(listOf(0, 5, 19, 0, 13, 19, 23, 13, 45, 19)))
    }

    @Test
    fun `should return result while dividing two numbers`() {
        assertEquals(2, maths.divide(100, 50))
    }

    @Test
    fun `should return result for multiplying two numbers`() {
        assertEquals(100, maths.multiply(20, 5))
    }

    @Test
    fun `should return percentage results for the given part and total numbers`() {
        assertEquals(100, maths.calculatePercentage(100, 100))
    }

    @Test
    fun `should return percentage results for the given different part and total numbers`() {
        assertEquals(83, maths.calculatePercentage(67, 80))
    }

    @Test
    fun `should return maximum of two numbers`() {
        assertEquals(80, maths.findMax(67, 80))
    }

    @Test
    fun `should return maximum of three numbers`() {
        assertEquals(90, maths.findMaxOfThree(67, 80, 90))
    }

    @Test
    fun `should return concatenated string`() {
        assertEquals("Hello InterviewDOT", maths.concat("Hello", "InterviewDOT"))
    }

    @Test
    fun `should return sum using reduce method`() {
        assertEquals(55, maths.sumUsingReduce().get())
    }

    @Test
    fun `should return true since the sentence contains numbers`() {
        assertEquals(true, maths.isSentenceContainsNumber("InterviewDOT"))
        assertEquals(false, maths.isSentenceContainsNumber("This is 4 you"))
    }

    @Test
    fun `should filter null from a list`() {
        val list = mutableListOf(null, 1L, null, 5L, 10L, 15L, null, 12L)
        assertEquals(listOf(1L, 5L, 10L, 15L, 12L), maths.filterFromLis(list))
    }

    @Test
    fun `should reverse the given number`() {
        assertEquals(789, maths.reverse(987))
        assertEquals(1, maths.reverse(1000))
        assertEquals(985, maths.reverse(589))
    }
}