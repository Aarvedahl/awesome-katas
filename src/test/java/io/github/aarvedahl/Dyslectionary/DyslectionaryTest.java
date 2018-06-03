package io.github.aarvedahl.Dyslectionary;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;
public class DyslectionaryTest {

    Dyslectionary dyslect;

    @Before
    public void init() {
        dyslect = new Dyslectionary();
    }

    @Test
    public void reverseWords() {
        List<List<String>> wordGroups = new LinkedList<>();
        List<String> group1 = new LinkedList<>();
        group1.add("Test1");
        group1.add("Test2");
        group1.add("Test3");
        List<String> group2 = new LinkedList<>();
        group2.add("Sample");
        group2.add("Sample1");
        group2.add("Sample2");
        wordGroups.add(group1);
        wordGroups.add(group2);
        List<List<String>> expected = new LinkedList<>();
        List<String> exGroup = new LinkedList<>();
        exGroup.add("1tseT");
        exGroup.add("2tseT");
        exGroup.add("3tseT");
        List<String> exGroup2 = new LinkedList<>();
        exGroup2.add("elpmaS");
        exGroup2.add("1elpmaS");
        exGroup2.add("2elpmaS");
        expected.add(exGroup);
        expected.add(exGroup2);
        for(int i=0; i<2; i++) {
            for(int j=0; j<3; j++) {
                assertEquals(expected.get(i).get(j), dyslect.reverseWords(wordGroups).get(i).get(j));
            }
        }
    }


}
