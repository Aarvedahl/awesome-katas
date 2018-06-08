package io.github.aarvedahl.romanNumerals;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RomanNumeralsTest {
    private RomanNumerals romanNumerals;

    /**
     * Convert numbers into Roman numerals
     * 1 --> I
     * 5 --> V
     * 4 --> IV
     * 9 --> IX
     * 10 --> X
     */
    @Before
    public void init() {
        romanNumerals = new RomanNumerals();
    }

    @Test
    public void makeIVMarks() {
        assertEquals("IV", romanNumerals.roman(4));
    }
    @Test
    public void makeIMarks() {
        assertEquals("I", romanNumerals.roman(1));
        assertEquals("II", romanNumerals.roman(2));
        assertEquals("III", romanNumerals.roman(3));


    }

   @Test
    public void makeVMarks() {
        assertEquals("V", romanNumerals.roman(5));
        assertEquals("VIII", romanNumerals.roman(8));
    }

    @Test
    public void makeXMarks() {
        assertEquals("X", romanNumerals.roman(10));
        assertEquals("XV", romanNumerals.roman(15));
        assertEquals("XVIII", romanNumerals.roman(18));
    }
}
