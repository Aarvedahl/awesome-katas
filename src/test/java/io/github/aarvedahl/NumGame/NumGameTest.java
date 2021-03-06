package io.github.aarvedahl.NumGame;


import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

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
        int[][] num = {{0, 2, 0, 2}, {4, 16, 8, 2}};
        int [][] result = {{4, 0, 0, 0}, {4, 16, 8, 2}};
        assertArrayEquals(result, numGame.performMove(0, num));
        assertEquals(4, numGame.performMove(0, num)[0][0]);
    }

    @Test
    public void performUpSwipe() {
        int[][] num = {
                {2,0,0,2},
                {4,16,8,2},
                {2,64,32,4},
                {1024,1024,64,0}
        };
        int [][] result = {
                {2, 16, 8, 4},
                {4, 64, 32, 4},
                {2, 1024, 64, 0},
                {1024, 0, 0, 0}
        };
        assertArrayEquals(result, numGame.performMove(1, num));
    }

    @Test
    public void performRightSwipe() {
        int[][] num = {
                {2, 0, 0, 2},
                {4, 16, 8, 2},
                {2, 64, 32, 4},
                {1024, 1024, 64, 0}
        };

        int [][] result = {
                {0, 0, 0, 4},
                {4, 16, 8, 2},
                {2, 64, 32, 4},
                {0, 0, 2048, 64}
        };
        assertArrayEquals(result, numGame.performMove(2, num));
    }

    @Test
    public void reverseArray() {
        int [] num = {1, 2, 3, 4};
        int [] result = {4, 3, 2, 1};
        assertArrayEquals(num, numGame.reverseArray(result));
    }

    @Test
    public void rotateLeft() {
        int[][] num =  {{1, 2}, {3, 4}};
        int[][] result = {{2, 4}, {1, 3}};
        assertArrayEquals(result, numGame.rotateLeft(num));
    }

    @Test
    public void rotateRight() {
        int[][] num = {{1, 2}, {3, 4}};
        int [][] result = {{3, 1}, {4, 2}};
        assertArrayEquals(result, numGame.rotateRight(num));
    }
}
