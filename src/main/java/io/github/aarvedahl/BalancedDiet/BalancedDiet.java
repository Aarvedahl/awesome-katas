package io.github.aarvedahl.BalancedDiet;

import java.util.*;

public class BalancedDiet {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // En Array istället för lista?
        List<Integer> numList = new ArrayList<>();
        while(scan.hasNextInt()) {
            int times = scan.nextInt();
            if(times == 0) {
                break;
            }

            for(int i=0; i<times; i++) {
                numList.add(scan.nextInt());
            }

            int meal1 = 0, meal2 = 0;

            Collections.sort(numList);
            Collections.reverse(numList);

            for(Integer integer: numList) {
                if (meal1 <= meal2) {
                    meal1 += integer;
                } else {
                    meal2 += integer;
                }
            }
            System.out.println(meal1 + " " + meal2);
        }
    }

    // Return true if there exists a subarray of array with given sum
    public static boolean subsetSum(int[] A, int n, int sum) {
        // return true if sum becomes 0 (subset found)
        if(sum == 0) {
            return true;
        }

        // base case: no items left or sum becomes negative
        if(n<0 || sum <0) {
            return false;
        }

        // Case 1. include current item in the subset (A[n] and recurse
        // for remaining items (n-1) with remaining sum (sum  - A[n])
        boolean include = subsetSum(A, n-1, sum - A[n]);

        // Case 2. exclude current item n from subset and recurse for
        // remaining items (n-1)
        boolean exclude = subsetSum(A, n-1, sum);

        return include || exclude;
    }

    // Return true if given array A [0..n-1] can be divided into subarrays with equal sum
    public static boolean partition(int[] A) {
        int sum = Arrays.stream(A).sum();

        // return true if sum is even and array can be two subarrays with equal sum
        return (sum & 1) == 0 && subsetSum(A, A.length-1, sum/2);

    }
}
