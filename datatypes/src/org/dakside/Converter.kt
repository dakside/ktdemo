package org.dakside

class ValueException(override var message: String) : Exception(message)

val MIN_F: Double = -459.67
val MIN_C: Double = -273.15

fun convertFtoC(f: Double): Double {
    if (f < -459.67) throw ValueException("F cannot be smaller than $MIN_F")
    return Math.max(MIN_C, (f - 32.0) / 1.8)
}

fun convertCtoF(c: Double): Double {
    if (c < -273.15) throw ValueException("C cannot be smaller than $MIN_C")
    return Math.max(MIN_F, c * 1.8 + 32)
}
