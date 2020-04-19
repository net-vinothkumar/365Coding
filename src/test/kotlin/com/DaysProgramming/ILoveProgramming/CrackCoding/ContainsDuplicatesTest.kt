package com.DaysProgramming.ILoveProgramming.CrackCoding

import junit.framework.Assert.assertTrue
import org.junit.Test

class ContainsDuplicatesTest {

    @Test
    fun `should return true for the given array which contains duplicate elements`() {
        val containsDuplicates = ContainsDuplicates()
        val numbers = arrayListOf<Int>()
        numbers.add(1)
        numbers.add(2)
        numbers.add(3)
        numbers.add(1)

        assertTrue(containsDuplicates.isDuplicate(numbers))
    }

}