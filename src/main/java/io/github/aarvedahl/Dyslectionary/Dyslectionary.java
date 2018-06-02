package io.github.aarvedahl.Dyslectionary;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Dyslectionary {


    public static void main(String[] args) {
        List<List<String>> wordGroups = new LinkedList<>();
        List<String> group1 = new LinkedList<>();
        wordGroups.add(group1);
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            System.out.println("Input == " + isNullOrBlank(scanner.nextLine()));
            if(isNullOrBlank(scanner.nextLine())) {
                List<String> group = new LinkedList<>();
            }
        }
    }

    private static boolean isNullOrBlank(String s) {
        return (s==null || s.trim().equals(""));
    }
}
