package com.DaysProgramming.ILoveProgramming

class KinderGarden {

    var kidsName: MutableList<String> = mutableListOf()

    fun add(name: String) {
        kidsName.add(name)
    }

    fun getKids() = kidsName
}