package org.dakside

import org.junit.Assert.*
import org.junit.Test

class ConverterTest {
    @Test
    fun testConvertFtoC() {
        assertEquals(0.0, convertFtoC(32.0), 0.0)
    }

    @Test(expected = ValueException::class)
    fun testIllegalFConversion() {
        assertEquals(0.0, convertFtoC(-3200.0), 0.0)
    }

    @Test
    fun testConvertCtoF() {
        assertEquals(32.0, convertCtoF(0.0), 0.0)

    }

    @Test
    fun testBorderlineCases() {
        assertEquals(-459.67, convertCtoF(-273.15), 0.001)
        assertEquals(-273.15, convertFtoC(-459.67), 0.001)
        assertEquals(convertCtoF(convertFtoC(-273.15)), convertFtoC(-459.67), 0.001)
        assertEquals(convertCtoF(-273.15), convertCtoF(convertFtoC(-459.67)), 0.001)
    }

    @Test(expected = ValueException::class)
    fun testIllegalConversion() {
        assertEquals(0.0, convertCtoF(-4700.0), 0.0)
    }
}