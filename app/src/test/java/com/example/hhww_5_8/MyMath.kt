package com.example.hhww_5_8


import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test

class MyMath {
    fun add(num1: Int, num2: Int): Int {
        return num1 + num2
    }
    fun remove(num1: Int, num2: Int): Int {
        return num1 - num2
    }
    fun delit(num1: Int, num2: Int): Int {
        return num1 / num2
    }
    fun umnojat(num1: Int, num2: Int): Int {
        return num1 * num2
    }

    fun getAllText(txt : String): String{

        val stringWithoutNumbers = txt.replace("\\d+".toRegex(), "")

        val regex = Regex("""\d+""")
        val matchResult = regex.find(stringWithoutNumbers)

        if (matchResult != null) {
            val number = matchResult.value.toInt()
            println(number)
        } else {
            println(stringWithoutNumbers)
        }


        return stringWithoutNumbers

    }


}