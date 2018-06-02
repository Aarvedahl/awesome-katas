package io.github.aarvedahl.Dyslectionary;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Dyslectionary {


    public static void main(String[] args) {
        List<List<String>> wordGroups = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        List<String> group = new LinkedList<>();
        wordGroups.add(group);
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            if (isNullOrBlank(input)) {
                group = new LinkedList<>();
                wordGroups.add(group);
                System.out.println(wordGroups.size());
            } else {
                group.add(input);
                System.out.println(wordGroups.size());
            }
        }

    }

    private static boolean isNullOrBlank(String s) {
        return (s == null || s.trim().equals(""));
    }

    private List<List<String>> reverseWords(List<List<String>> listWordGroups) {
        List<List<String>> wordGroups = new LinkedList<>();
        for (List<String> group : listWordGroups) {
            List<String> newGroup = new LinkedList<>();
            wordGroups.add(newGroup);
            for (String word : group) {
                String reversed = new StringBuilder(word).reverse().toString();
                newGroup.add(reversed);
            }
        }
        return wordGroups;
    }

    private List<List<String>> sortLists(List<List<String>> listWordGroups) {
        for (List<String> group : listWordGroups) {
            Collections.sort(group);
        }
        return listWordGroups;
    }
}
