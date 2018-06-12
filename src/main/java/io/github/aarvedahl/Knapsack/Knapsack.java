package io.github.aarvedahl.Knapsack;


import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Knapsack {
    static int[] values = new int[]{894, 260, 392, 281, 27};
    static int[] weights = new int[]{15, 6, 4, 2, 21};
    static Map<Integer, Map<Integer, Integer>> map = new HashMap<>();

    public static Integer knapsack(int i, int W) {
        int result = 0;
        if (map.containsKey(i)) {
            System.out.println("Contains here");
            return map.get(i).get(W);
        }
        if (i == 0 || W == 0) {
            result = 0;
        } else if (weights[i] > W) {
            result = knapsack(i - 1, W);
        } else {
            result = Math.max(knapsack(i - 1, W), knapsack(i - 1, W - weights[i]) + values[i]);
        }
        
        map.put(i, new HashMap<>());
        map.get(i).put(W, result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(knapsack(values.length - 1, 10));
    }
}

