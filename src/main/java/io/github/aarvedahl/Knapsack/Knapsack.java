package io.github.aarvedahl.Knapsack;


import java.util.stream.IntStream;

public class Knapsack {
    static int[] values = new int[] {894, 260, 392, 281, 27};
    static int[] weights = new int[] {15, 6, 4, 2, 21};
    static int[][] memo = new int[values.length][weights.length];

    public static Integer knapsack(int i, int W) {
        //if(lists.get(n).get(C) != null) {
        //    return lists.get(n).get(C);
        int result = 0;
       // if(memo[i][W] != 0) {
       //     return memo[i][W];
       // }
        if(i == 0 || W == 0) {
            result = 0;
        } else if (weights[i] > W) {
            result = knapsack(i-1, W);
        } else {
            result = Math.max(knapsack(i-1, W), knapsack(i-1, W - weights[i]) + values[i]);
        }
        memo[i][W] = result;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(knapsack(values.length-1, 10));
    }
}
