package com.DaysProgramming.ILoveProgramming.swimming

import java.util.stream.Collectors

class SwimmingTicket {
    /**
     * age 6 = free
     * age 7-18 = 5
     * age > 18 < 65 = 10
     * age > 65 = free
     * group of 5 students -> 1 student offer  -> student age between 16 -19
     */
    fun buyTickets(ages: List<Int>): Long {
        if (isValidAges(ages)) {
            val students = getStudentList(ages)

            if (ages.size == students.size) {
                return 10L * (ages.size - 1)
            }

            return ages
                    .stream()
                    .map { age -> getPrice(age) }
                    .mapToLong { value -> value }
                    .sum()
        }
        return 0
    }

    private fun isValidAges(ages: List<Int>) = ages.stream().anyMatch { age -> age > 0 }

    private fun getStudentList(ages: List<Int>): List<Int> {
        return ages
                .stream()
                .filter{ age -> isStudentAge(age) }
                .collect(Collectors.toList())
    }

    private fun isStudentAge(age: Int) = (age in 16..19)

    private fun getPrice(age: Int): Long {
        return when {
            age == 6 || age > 65 -> 0
            age in 8..17 -> 5
            age in 18..65 -> 10
            else -> 0
        }
    }
}