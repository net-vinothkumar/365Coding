package com.DaysProgramming.ILoveProgramming.swimming

import org.junit.Assert.assertEquals
import org.junit.Test
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.Month

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

    @Test
    fun `should return the tickets price babies as 0`() {
        val ages = listOf(1, 2, 3, 4, 5)
        assertEquals(0, swimmingTicket.buyTickets(ages))
    }

    @Test
    fun `should return the tickets price 2 euro more during the weekend`() {
        val ages = listOf(17, 59, 6, 20, 5)
        val pattern = "yyyy-MM-dd"
        val simpleDateFormat = SimpleDateFormat(pattern)

        val date = simpleDateFormat.parse("2019-09-21")
        assertEquals(31, swimmingTicket.buyTickets(ages, date))
    }
}