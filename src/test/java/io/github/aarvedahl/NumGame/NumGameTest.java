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
        assertEquals(4, numGame.listOfLists.size());
    }

    @Test
    public void emptyLists() {
        assertEquals(0, numGame.listOfLists.get(0).size());
    }


}
