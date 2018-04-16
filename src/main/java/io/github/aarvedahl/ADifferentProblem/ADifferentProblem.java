package io.github.aarvedahl.ADifferentProblem;

import java.util.Scanner;

public class ADifferentProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLong()) {
            long a = sc.nextLong(), b = sc.nextLong();
            // solve test case and output answer
            long diff = 0;
            if(a < b) {
                diff = b - a;
            } else {
                diff = a - b;
            }
            System.out.println(diff);
        }
    }
}
