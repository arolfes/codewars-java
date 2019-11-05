package com.github.arolfes.codewars;

import static com.github.arolfes.codewars.RomanNumeralsEncoder.encodeNumberToRomanNumber;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RomanNumeralsEncoderTest {

    @Test
    public void testEncodeNumberToRomanNumber() throws Exception {
        assertEquals("encodeNumberToRomanNumber(1) should equal to I", "I", encodeNumberToRomanNumber(1));
        assertEquals("encodeNumberToRomanNumber(4) should equal to IV", "IV", encodeNumberToRomanNumber(4));
        assertEquals("encodeNumberToRomanNumber(6) should equal to VI", "VI", encodeNumberToRomanNumber(6));
        assertEquals("encodeNumberToRomanNumber(1990) should equal to MCMXC", "MCMXC", encodeNumberToRomanNumber(1990));
        assertEquals("encodeNumberToRomanNumber(2008) should equal to MMVIII", "MMVIII", encodeNumberToRomanNumber(2008));
        assertEquals("encodeNumberToRomanNumber(1666) should equal to MDCLXVI", "MDCLXVI", encodeNumberToRomanNumber(1666));
    }

}
