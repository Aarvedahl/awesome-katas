package io.github.aarvedahl.BalancedDiet;

import java.util.*;

public class BalancedDiet {

    static int[][] knapList;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            int number = scan.nextInt();
            if(number == 0) {
                break;
            }

            int[] cals = new int[number];
            int sum = 0;

            for(int i=0; i<cals.length; i++) {
                cals[i] = scan.nextInt();
                sum+=cals[i];
            }

            knapList = new int[number+1][sum/2 +1];

            int small = knapsack(cals, number, sum/2);
            int big = sum - small;

            System.out.println(big + " " + small);
        }
        scan.close();
    }

    public static int knapsack(int[] nums, int n, int W) {
        for(int i=0; i<knapList.length; i++) {
            for(int j=0; j<knapList[0].length; j++) {
                if(i == 0 || j == 0) {
                    knapList[i][j] = 0;
                } else if(nums[i -1] > j) {
                    knapList[i][j] = knapList[i-1][j];
                } else {
                    knapList[i][j] = Math.max(knapList[i-1][j], nums[i-1] + knapList[i-1][j-nums[i-1]]);
                }
            }
        }
        return knapList[n][W];
    }
}
