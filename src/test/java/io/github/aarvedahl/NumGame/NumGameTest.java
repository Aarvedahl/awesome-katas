package io.github.aarvedahl.NumGame;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class NumGameTest {

    NumGame numGame;

    @Before
    public void init() {
        numGame = new NumGame();
    }

    @Test
    public void init4Lists() {
        assertEquals(4, numGame.numbers.length);
        assertEquals(4, numGame.numbers[1].length);
        assertEquals(4, numGame.numbers[2].length);
        assertEquals(4, numGame.numbers[3].length);
        assertEquals(4, numGame.numbers[4].length);
    }
    
}
