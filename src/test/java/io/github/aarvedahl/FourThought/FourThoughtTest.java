package io.github.aarvedahl.FourThought;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FourThoughtTest {

    FourThought fourThought;
    @Before
    public void init() {
        fourThought = new FourThought();
    }

    @Test
    public void writeSolution() {
        assertEquals("4 + 4 + 4 + 4", fourThought.writeSolution(16));
    }

    @Test
    public void writeDivision() {
        assertEquals("4 + 4 + 4 / 4", fourThought.writeSolution(9 ));
    }

    @Test
    public void return0() {
        assertEquals("4 + 4 - 4 + 4", fourThought.writeSolution(0));
    }

    @Test
    public void return7() {
        assertEquals("4 + 4 - 4 / 4", fourThought.writeSolution(7));
    }
}
