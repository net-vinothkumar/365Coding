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
}