package com.DaysProgramming.ILoveProgramming.CrackCoding

class ContainsDuplicates {
    fun isDuplicate(numbers: ArrayList<Int>): Boolean {
        val uniqueNumbers = HashSet<Int>()
        numbers.forEach { number ->
            if (uniqueNumbers.contains(number))
                return true
            uniqueNumbers.add(number)
        }
        return false
    }
}