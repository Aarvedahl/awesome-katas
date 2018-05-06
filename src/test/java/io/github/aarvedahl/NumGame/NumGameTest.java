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
        assertEquals(4, numGame.numbers[0].length);
        assertEquals(4, numGame.numbers[1].length);
        assertEquals(4, numGame.numbers[2].length);
        assertEquals(4, numGame.numbers[3].length);
    }


    @Test
    public void performLeftSwipe() {
        int[][] num = {{2, 0, 0, 2}, {4, 16, 8, 2}};
        int [][] result = {{4, 0, 0, 0}, {4, 16, 8, 2}};
        assertArrayEquals(result, numGame.performMove(0, num));
        assertEquals(4, numGame.performMove(0, num)[0][0]);
    }
    
}
