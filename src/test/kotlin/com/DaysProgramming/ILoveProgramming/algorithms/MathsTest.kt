package com.DaysProgramming.ILoveProgramming.algorithms

import org.junit.Assert.assertEquals
import org.junit.Test

class MathsTest {

    @Test
    fun `should return sum of two integers`(){
        val maths = Maths()
        assertEquals(0, maths.sum(0, 0))
    }

    @Test
    fun `should return 100 after adding 45 and 55`(){
        val maths = Maths()
        assertEquals(100, maths.sum(45, 55))
    }

    @Test
    fun `should return sum of 5 numbers using stream api`(){
        val maths = Maths()
        assertEquals(15, maths.sumUsingStreamAPI(listOf(1, 2, 3, 4, 5)))
    }

    @Test
    fun `should return sorted number using stream api`(){
        val maths = Maths()
        assertEquals(listOf(1,2,3,4,5), maths.sortNumbersUsingStreamAPI(listOf(5, 3, 1, 4, 2)))
    }

    @Test
    fun `should return difference of two numbers`(){
        val maths = Maths()
        assertEquals(279, maths.difference(1045, 766))
    }

    @Test
    fun `should return distinct sorted numbers`(){
        val maths = Maths()
        assertEquals(listOf(0, 5, 13, 19), maths.distinctSorted(listOf(0, 5, 19, 0, 13, 19, 23, 13, 45, 19)))
    }

    @Test
    fun `should return result while dividing two numbers`(){
        val maths = Maths()
        assertEquals(2, maths.divide(100, 50))
    }

}