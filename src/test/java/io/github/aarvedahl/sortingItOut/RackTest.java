package io.github.aarvedahl.sortingItOut;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RackTest {
    private Rack rack;
    private List<Integer> ballsTest = new ArrayList<Integer>();
    @Before
    public void init(){
        rack = new Rack();
    }

    @Test
    public void emptyList(){
        assertThat(ballsTest, is(rack.balls));
    }

    @Test
    public void add() {
        addToLists(20);
        assertThat(ballsTest, is(rack.balls));
        addToLists(10);
        assertThat(ballsTest, is(rack.balls));
    }

    private void addToLists(int number) {
        rack.add(number);
        ballsTest.add(number);
    }

    @Test
    public void sortLists() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(22);
        list.add(25);
        addToLists(20);
        addToLists(10);
        addToLists(25);
        addToLists(22);

        assertThat(list, is(rack.bubbleSort(rack.balls)));
    }


}
