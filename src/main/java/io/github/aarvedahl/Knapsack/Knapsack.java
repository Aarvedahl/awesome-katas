package io.github.aarvedahl.Knapsack;


import java.util.*;

public class Knapsack {
    static int[] values = new int[]{894, 260, 392, 281, 27};
    static int[] weights = new int[]{15, 6, 4, 2, 21};


    public static Integer knapsack(int i, double W, List<Integer> values, List<Integer> weights) {
        int result = 0;
        if (i == 0 || W == 0) {
            result = 0;
        } else if (weights.get(i) > W) {
            result = knapsack(i - 1, W, values, weights);
        } else {
            result = Math.max(knapsack(i - 1, W, values, weights), knapsack(i - 1, W - weights.get(i), values, weights) + values.get(i));
        }


        return result;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        while(scanner.hasNext()) {
            List<Integer> values = new ArrayList<>();
            List<Integer> weights = new ArrayList<>();
            double weight = scanner.nextDouble();
            int objects = scanner.nextInt();
            for(int i=0; i<objects; i++) {
                values.add(scanner.nextInt());
                weights.add(scanner.nextInt());
            }
            System.out.println(knapsack(values.size() -1, weight, values, weights));
        }
    }
}

