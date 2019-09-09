package com.DaysProgramming.ILoveProgramming.swimming

class SwimmingTicket {
    /**
     * age 6 = free
     * age 7-18 = 5
     * age > 18 < 65 = 10
     * age > 65 = free
     *
     */
    fun buyTickets(ages: List<Int>): Long {
        return ages
                .stream()
                .map { age -> getPrice(age) }
                .mapToLong { value  -> value }
                .sum()
    }

    private fun getPrice(age: Int): Long {
        return when {
            age == 6 || age > 65 -> 0
            age in 8..17 -> 5
            age in 18..65 -> 10
            else -> 0
        }
    }
}