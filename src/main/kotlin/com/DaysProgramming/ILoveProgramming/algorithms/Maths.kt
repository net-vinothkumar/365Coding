package com.DaysProgramming.ILoveProgramming.algorithms

import java.util.stream.Collectors.toList


class Maths {
    fun sum(firstNumber: Int, secondNumber: Int): Int {
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

    fun distinctSorted(numbers: List<Int>): List<Int> {
        return numbers.stream().distinct().sorted().limit(4).collect(toList())
    }

    fun divide(dividend: Int, divisor: Int): Int {
        return dividend / divisor
    }

}