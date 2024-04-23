package com.example.hhww_5_8

import junit.framework.TestCase
import org.junit.After
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    private var math: MyMath? = null

    @Before
    fun setUp() {
        math = MyMath()
        println("Before")
    }

    @Test
    fun simpleAddCase() {
        TestCase.assertEquals(4, math?.add(5, 10))
        println("Simple Add Case")
    }

    @Test
    fun simpleDeCase() {
        TestCase.assertEquals(4, math?.remove(5, 10))
        println("Simple De Case")
    }

    @Test
    fun simpleGeCase() {
        TestCase.assertEquals(4, math?.delit(5, 10))
        println("Simple Ge Case")
    }

    @Test
    fun simpleVrCase() {
        TestCase.assertEquals(4, math?.umnojat(5, 10))
        println("Simple Vr Case")
    }

    @Test
    fun reversedTextCaseO() {
        TestCase.assertEquals("apple hello", math?.getAllText("hello a5768pple"))
    }

    @After
    fun tearDown() {
        math = null
        println("After")
    }
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
}