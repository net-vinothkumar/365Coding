package com.DaysProgramming.ILoveProgramming.swimming

import java.util.Date

class SwimmingTicket {
    /**
     * age 6 = free
     * age 7-18 = 5
     * age > 18 < 65 = 10
     * age > 65 = free
     * group of 5 students -> 1 student offer  -> student age between 16 -19
     * weekend 2 extra price
     */

    private val codeForSaturday = 6
    private val codeForSunday = 0

    fun buyTickets(ages: List<Int>, date: Date = Date()): Long {
        val additionalCost = calculateWeekEndCost(date)
        if (isValidAges(ages)) {
            val students = getStudentList(ages)

            if (ages.size == students.size) {
                return 10L * (ages.size - 1)
            }

            return ages
                    .stream()
                    .map { age -> getPrice(age, additionalCost) }
                    .mapToLong { value -> value }
                    .sum()
        }
        return 0
    }

    private fun calculateWeekEndCost(date: Date): Long {
        val day = date.day
        var additionalCost = 0L
        if (day == codeForSunday || day == codeForSaturday) {
            additionalCost = 2L
        }
        return additionalCost
    }

    private fun isValidAges(ages: List<Int>) = ages.stream().anyMatch { age -> age > 0 }

    private fun getStudentList(ages: List<Int>): List<Int> {
        return ages
                .filter { age -> isStudentAge(age) }
    }

    private fun isStudentAge(age: Int) = (age in 16..19)

    private fun getPrice(age: Int, additionalCost: Long): Long {
        return when {
            age == 6 || age > 65 -> 0
            age in 8..17 -> 5 + additionalCost
            age in 18..65 -> 10 + additionalCost
            else -> 0
        }
    }
}