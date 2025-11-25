package com.example.hamcrest1

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class MathUtilsTest {

    private val mathUtils = MathUtils()

    @Test
    fun add() {
        val result = mathUtils.add(2, 3)
        assertEquals(5, result)
        assertThat(result, `is`(5))
    }

    @Test
    fun subtract() {
        val result = mathUtils.subtract(5, 2)
        assertEquals(3, result)
        assertThat(result, equalTo(3))
    }

    @Test
    fun divide() {
        val result = mathUtils.divide(10, 2)
        assertEquals(5.0, result)
        
        assertThrows(IllegalArgumentException::class.java) {
            mathUtils.divide(10, 0)
        }
    }

    @Test
    fun isEven() {
        assertTrue(mathUtils.isEven(4))
        assertFalse(mathUtils.isEven(3))
        
        assertThat(mathUtils.isEven(4), `is`(true))
    }
}
