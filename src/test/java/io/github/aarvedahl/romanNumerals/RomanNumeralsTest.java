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
    public void makeIMarks() {
        assertEquals("I", romanNumerals.makeIMarks(1));
        assertEquals("II", romanNumerals.makeIMarks(2));
        assertEquals("III", romanNumerals.makeIMarks(3));

    }

   /* @Test
    public void makeVMarks() {
        assertEquals("V", romanNumerals.makeVMarks(5));
    } */
}