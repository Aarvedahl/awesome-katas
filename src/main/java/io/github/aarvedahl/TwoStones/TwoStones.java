package io.github.aarvedahl.TwoStones;

import java.util.Scanner;

public class TwoStones {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int stone = scan.nextInt();
            if(stone % 2 == 0) {
                System.out.println("Bob");
            } else {
                System.out.println("Alice");
            }

        }
    }
}
