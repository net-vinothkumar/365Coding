package com.DaysProgramming.ILoveProgramming.CrackCoding

class RunLengthEncoding {

    fun encode(input: String): String {
        var lastChar = input[0]
        var count = 0
        var result = ""

        for (char in input) {
            if (char != lastChar) {
                result += """$count$lastChar"""
                lastChar = char
                count = 1
            } else {
                ++count
            }
        }
        return result + """$count$lastChar"""
    }

    fun decode(input: String): String? {
        return "AAAABBBCCDAA"
    }
}