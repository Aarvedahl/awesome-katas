package io.github.aarvedahl.Knapsack;


public class Knapsack {
    static int[] values = new int[] {894, 260, 392, 281, 27};
    static int[] weights = new int[] {15, 6, 4, 2, 21};


    public static Integer knapsack(int i, int W) {
        //if(lists.get(n).get(C) != null) {
        //    return lists.get(n).get(C);

        if(i < 0 || W == 0) {
            return 0;
        } else if (weights[i] > W) {
            return knapsack(i-1, W);
        } else {
            return Math.max(knapsack(i-1, W), knapsack(i-1, W - weights[i]) + values[i]);
        }

    }

    public static void main(String[] args) {
        System.out.println(knapsack(values.length-1, 30));
    }
}
