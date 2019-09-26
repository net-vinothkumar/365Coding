package com.DaysProgramming.ILoveProgramming

import org.junit.Assert.assertEquals
import org.junit.Test

class KinderGardenTest {

    @Test
    fun `should add the kids name to the class`() {
        val kinderGarden = KinderGarden()
        kinderGarden.add("John")
        kinderGarden.add("David")
        kinderGarden.add("Philip")
        kinderGarden.add("Claudia")

        assertEquals(kinderGarden.getKids()[0], "John")
        assertEquals(kinderGarden.getKids()[1], "David")
        assertEquals(kinderGarden.getKids()[2], "Philip")
        assertEquals(kinderGarden.getKids()[3], "Claudia")
    }
}