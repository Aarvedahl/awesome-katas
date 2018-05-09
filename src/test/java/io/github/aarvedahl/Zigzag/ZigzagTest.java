package io.github.aarvedahl.Zigzag;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZigzagTest {

    Zigzag zigzag;

    @Before
    public void init() {
        zigzag = new Zigzag();
    }

    @Test
    public void countSequences() {
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(1, 2, 3, 4));
        list.add(Arrays.asList(1, 2, 3));
        assertEquals(4, zigzag.countSequences(list));
        list.add(Arrays.asList(3, 4, 5, 6, 2 ,1));
        list.add(Arrays.asList(1, 2));
        assertEquals(6, zigzag.countSequences(list));
    }

    @Test
    public void splitList() {
        List<Integer> numList = Arrays.asList(1, 2, 3, 4, 2);
        List<List<Integer>> resultList = new ArrayList<>();
        resultList.add(Arrays.asList(1, 3, 2));
        resultList.add(Arrays.asList(1, 4, 2));
        resultList.add(Arrays.asList(2, 3, 2));
        resultList.add(Arrays.asList(2, 4, 2));
        resultList.add(Arrays.asList(3, 4, 2));
        assertEquals(resultList, zigzag.splitList(numList));
    }

}
