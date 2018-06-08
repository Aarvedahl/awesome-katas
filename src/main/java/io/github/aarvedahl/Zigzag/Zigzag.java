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
Det viktiga är inte skillnaden utan att det är en jämfördelning mellan upp och ner
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
        while (list.size() <= amount) {
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
        for (int i = 0; i < lists.size(); i++) {
            if (lists.get(i).size() > longest) {
                longest = lists.get(i).size();
            }
        }
        return longest;
    }

    /*


    [1,, 2, 3, 4, 2]
    seq = []
    for i in list:
        numList = []
        for int j=i i<list.size i++:
            if j > i:
                numList.add(j);

     */

    public List<List<Integer>> splitList(List<Integer> numList) {
        List<List<Integer>> listOfSequences = new ArrayList<>();
        for (int i = 0; i < numList.size(); i++) {
            List<Integer> listOfNumbers = new ArrayList<>();
            listOfNumbers.add(numList.get(i));
            int stepsUp = 0;
            int stepsDown = 0;
            for (int j = i; j < numList.size(); j++) {
                if (numList.get(j) > listOfNumbers.get(listOfNumbers.size() - 1)) {
                    listOfNumbers.add(numList.get(j));
                    stepsUp += 1;
                }
            }
            for(int down = i; down <numList.size(); down++) {
                if(numList.get(down) < listOfNumbers.get(listOfNumbers.size() -1)) {
                    listOfNumbers.add(numList.get(down));
                    stepsDown += 1;
                }
            }
            System.out.println("Steps up = " + stepsUp);
            System.out.println("Steps down = " + stepsDown);
            listOfSequences.add(listOfNumbers);
        }

        return listOfSequences;
    }
}
