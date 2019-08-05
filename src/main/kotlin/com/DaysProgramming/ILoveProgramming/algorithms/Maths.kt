package com.DaysProgramming.ILoveProgramming.algorithms


class Maths {
     fun sum( firstNumber : Int, secondNumber : Int) : Int {
        return firstNumber + secondNumber
    }

    fun sumUsingStreamAPI(numbers: List<Long>): Long {
        return numbers.sum()
    }
}