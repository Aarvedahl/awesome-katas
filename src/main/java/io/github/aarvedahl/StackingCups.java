package io.github.aarvedahl;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class StackingCups {

    Map<Integer, String> map = new TreeMap<>();

    public StackingCups() {
        takeInput();
    }

    public static void main(String[] args) {
        StackingCups stackingCups = new StackingCups();
    }

    private void takeInput() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();


        for (int i = 0; i <number; i++)  {
            String a = sc.next(), b = sc.next();
            try{
                int radius = Integer.parseInt(b);
                map.put(radius * 2, a);
            } catch (Exception e) {
                int radius = Integer.parseInt(a);
                map.put(radius, b);
            }
        }
        for(int radius: map.keySet()) {
            System.out.println(map.get(radius));
        }
    }
}
