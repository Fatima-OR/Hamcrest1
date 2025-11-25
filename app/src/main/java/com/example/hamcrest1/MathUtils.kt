package com.example.hamcrest1

class MathUtils {
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun subtract(a: Int, b: Int): Int {
        return a - b
    }

    fun divide(a: Int, b: Int): Double {
        if (b == 0) {
            throw IllegalArgumentException("Divisor cannot be zero")
        }
        return a.toDouble() / b
    }

    fun isEven(n: Int): Boolean {
        return n % 2 == 0
    }
}
