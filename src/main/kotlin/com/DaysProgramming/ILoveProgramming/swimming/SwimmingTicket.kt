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
                .mapToLong { x -> x }
                .sum()
    }

    private fun getPrice(age: Int): Long {
        if (age == 6 || age > 65) {
            return 0
        } else if (age in 8..17) {
            return 5
        } else if (age in 18..65) {
            return 10
        }
        return 0
    }
}