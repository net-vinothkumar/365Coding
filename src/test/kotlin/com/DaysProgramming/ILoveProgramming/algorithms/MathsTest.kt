package com.DaysProgramming.ILoveProgramming.algorithms

import org.junit.Assert.assertEquals
import org.junit.Test

class MathsTest {

    @Test
    fun `should return sum of two integers`(){
        val maths = Maths()
        assertEquals(0, maths.sum(0, 0))
    }

}