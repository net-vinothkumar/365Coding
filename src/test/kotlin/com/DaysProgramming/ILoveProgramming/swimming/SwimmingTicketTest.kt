package com.DaysProgramming.ILoveProgramming.swimming

import org.junit.Assert.assertEquals
import org.junit.Test

class SwimmingTicketTest {

    private val swimmingTicket = SwimmingTicket()

    @Test
    fun `should return the length of the given sentence`() {
        val ages = listOf(12, 19, 6, 46, 71)
        assertEquals(100, swimmingTicket.buyTickets(ages))
    }
}