package com.DaysProgramming.ILoveProgramming.algorithms

class Maths {
     fun sum( firstNumber : Int, secondNumber : Int) : Int {
        return firstNumber + secondNumber
    }

    fun sumUsingStreamAPI(numbers: List<Long>): Long {
        return numbers.sum()
    }

    fun sortNumbersUsingStreamAPI(numbers: List<Int>): List<Int> {
        return numbers.sorted()
    }

    fun difference(firstNumber: Int, secondNumber: Int): Int {
        return firstNumber - secondNumber
    }
}