package com.DaysProgramming.ILoveProgramming.CrackCoding

import junit.framework.Assert.assertEquals
import org.junit.Test

class RunLengthEncodingTest {

    @Test
    fun `should return encoded value 4A3B2C1D2A for AAAABBBCCDAA`() {
        val runLengthEncoding = RunLengthEncoding()
        assertEquals("4A3B2C1D2A", runLengthEncoding.encode("AAAABBBCCDAA"))
    }

    @Test
    fun `should return decoded value AAAABBBCCDAA for 4A3B2C1D2A`() {
        val runLengthEncoding = RunLengthEncoding()
        assertEquals("AAAABBBCCDAA", runLengthEncoding.decode("4A3B2C1D2A"))
    }
}