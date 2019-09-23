package com.DaysProgramming.ILoveProgramming

import org.junit.Assert.assertEquals
import org.junit.Test

class KinderGardenTest {

    @Test
    fun `should add the kids name to the class`() {
        val kinderGarden = KinderGarden()
        kinderGarden.add("John")

        assertEquals(kinderGarden.getKids().get(0), "John")
    }
}