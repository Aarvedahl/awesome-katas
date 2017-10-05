package io.github.aarvedahl.sortingItOut;

import java.util.ArrayList;
import java.util.List;

public class Rack {

    List<Integer> balls = new ArrayList<Integer>();

    public void add(int number) {
        balls.add(number);
    }

    public List<Integer> bubbleSort(List<Integer> list) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int a = 0; a < list.size() - 1; a++) {
                if (list.get(a).compareTo(list.get(a + 1)) > 0) {
                    int temp = list.get(a);
                    list.set(a, list.get(a + 1));
                    list.set((a + 1), temp);
                    swapped = true;
                }
            }
        }
        return list;
    }
}
