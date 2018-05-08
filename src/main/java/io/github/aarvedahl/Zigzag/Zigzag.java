package io.github.aarvedahl.Zigzag;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
A sequence of integers is said to Zigzag if adjacent elements alternate between strictly increasing and strictly decreasing.
Note that the sequence may start by either increasing or decreasing. Given a sequence of integers, determine the length of the longest subsequence that Zigzags. For example, consider this sequence:

Sequence: 1 2 3 4 2

Several subsequences: 1 3 2        1 4 2        2 3 2        2 4 2        3 4 2

Alltid samma skillnad mellan numren både när den öker och sen minskar
Gå igenom listan och kolla på t.ex det första numret sen så letar vi efter nummer som är större om vi hittar något nummer som är större så sparar vi den skillnaden och jämför om vi hittar något mer nummer som är större
Om vi inte skulle hitta något nummer som är större så börjar vi att kolla efter nummer som är mindre med samma skillnad.
 */

public class Zigzag {

    List<Integer> list = new ArrayList<>();
    List<List<Integer>> sequences = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
    }

    public Zigzag() {
      //  takeInput();
    }

    private void takeInput() {
        int amount = scanner.nextInt();
        while(list.size() <= amount) {
            int num = scanner.nextInt();
            list.add(num);
        }
        findSequence(list);
    }

    public List<Integer> findSequence(List<Integer> list) {

        return list;
    }


    public int countSequences(List<List<Integer>> lists) {
        int longest = 0;
        for(int i = 0; i<lists.size(); i++) {
            if(lists.get(i).size() > longest) {
                longest = lists.get(i).size();
            }
        }
        return longest;
    }
}
