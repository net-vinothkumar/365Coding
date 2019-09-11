package com.DaysProgramming.ILoveProgramming.swimming

import org.junit.Assert.assertEquals
import org.junit.Test

class SwimmingTicketTest {

    private val swimmingTicket = SwimmingTicket()

    @Test
    fun `should return the tickets price for the given invalid ages`() {
        val ages = listOf(-1, -1, -1, -1, -1)
        assertEquals(0, swimmingTicket.buyTickets(ages))
    }

    @Test
    fun `should return the tickets price for the given ages`() {
        val ages = listOf(12, 19, 6, 46, 71)
        assertEquals(25, swimmingTicket.buyTickets(ages))
    }

    @Test
    fun `should return the tickets price for the group of 5 students with 1 student offer`() {
        val ages = listOf(18, 19, 18, 19, 18)
        assertEquals(40, swimmingTicket.buyTickets(ages))
    }
}