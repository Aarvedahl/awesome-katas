package io.github.aarvedahl.sortingItOut;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class SortCharactersTest {
    private SortCharacters sortCharacters;
    @Before
    public void init() {
        sortCharacters = new SortCharacters();
    }

    @Test
    public void removeSpaces () {
        assertEquals("ABC", sortCharacters.removeSpaces("A B C"));
    }

    @Test
    public void toLowerCase() {
        assertEquals("abc", sortCharacters.toLowerCase("ABC"));
    }

    @Test
    public void sortString() {
        assertEquals("aaabc", sortCharacters.sortString("abaac"));
    }
}