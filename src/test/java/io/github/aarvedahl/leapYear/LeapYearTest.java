package io.github.aarvedahl.leapYear;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class LeapYearTest {
    private LeapYearCheck leapYearCheck;

    /* After 1582
       Evenly divisible by 4 and not divisible by 100
       If a year is evenly divisible by both 100 and 400 */


    @Before
    public void init() {
        leapYearCheck = new LeapYearCheck();
    }

    @Test
    public void after1582() {
        assertEquals(false, leapYearCheck.after1582(1200));
        assertEquals(true, leapYearCheck.after1582(1600));
        assertEquals(true, leapYearCheck.after1582(1582));
    }

    @Test
    public void evenlyDivisibleBy4() {
        assertEquals(true, leapYearCheck.isLeapYear(1600));
    }

    @Test
    public void evenlyDivisibleBy100() {
        assertEquals(true, leapYearCheck.isLeapYear(2000));
    }

    @Test
    public void notDivisibleBy100() {
        assertEquals(false, leapYearCheck.isLeapYear(1900));
    }
}
