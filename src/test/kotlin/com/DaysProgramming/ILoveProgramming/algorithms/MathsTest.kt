package com.DaysProgramming.ILoveProgramming.algorithms

import org.junit.Assert.assertEquals
import org.junit.Test

class MathsTest {

    @Test
    fun `should return sum of two integers`() {
        val maths = Maths()
        assertEquals(0, maths.sum(0, 0))
    }

    @Test
    fun `should return 100 after adding 45 and 55`() {
        val maths = Maths()
        assertEquals(100, maths.sum(45, 55))
    }

    @Test
    fun `should return sum of 5 numbers using stream api`() {
        val maths = Maths()
        assertEquals(15, maths.sumUsingStreamAPI(listOf(1, 2, 3, 4, 5)))
    }

    @Test
    fun `should return sorted number using stream api`() {
        val maths = Maths()
        assertEquals(listOf(1, 2, 3, 4, 5), maths.sortNumbersUsingStreamAPI(listOf(5, 3, 1, 4, 2)))
    }

    @Test
    fun `should return difference of two numbers`() {
        val maths = Maths()
        assertEquals(279, maths.difference(1045, 766))
    }

    @Test
    fun `should return distinct sorted numbers`() {
        val maths = Maths()
        assertEquals(listOf(0, 5, 13, 19), maths.distinctSorted(listOf(0, 5, 19, 0, 13, 19, 23, 13, 45, 19)))
    }

    @Test
    fun `should return result while dividing two numbers`() {
        val maths = Maths()
        assertEquals(2, maths.divide(100, 50))
    }

    @Test
    fun `should return result for multiplying two numbers`() {
        val maths = Maths()
        assertEquals(100, maths.multiply(20, 5))
    }

    @Test
    fun `should return percentage results for the given part and total numbers`() {
        val maths = Maths()
        assertEquals(100, maths.calculatePercentage(100, 100))
    }

    @Test
    fun `should return percentage results for the given different part and total numbers`() {
        val maths = Maths()
        assertEquals(83, maths.calculatePercentage(67, 80))
    }

    @Test
    fun `should return maximum of two numbers`() {
        val maths = Maths()
        assertEquals(80, maths.findMax(67, 80))
    }

    @Test
    fun `should return concatenated string`() {
        val maths = Maths()
        assertEquals("Hello InterviewDOT", maths.concat("Hello", "InterviewDOT"))
    }

    @Test
    fun `should return sum using reduce method`() {
        val maths = Maths()
        assertEquals(55, maths.sumUsingReduce().get())
    }

    @Test
    fun `should return true since the sentence contains numbers`() {
        val maths = Maths()
        assertEquals(true, maths.isSentenceContainsNumber("InterviewDOT"))
        assertEquals(false, maths.isSentenceContainsNumber("This is 4 you"))
    }

    @Test
    fun `should filter null from a list`() {
        val maths = Maths()
        val list : MutableList<Long?> = mutableListOf(null, 1L, null, 5L, 10L, 15L, null, 12L)
        assertEquals(listOf<Long>(1L, 5L, 10L, 15L, 12L), maths.filterFromLis(list))
    }
}