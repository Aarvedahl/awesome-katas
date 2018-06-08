package io.github.aarvedahl;

import java.util.Scanner;

public class Subway {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        int mins = 0;
        int delayedSeconds = 0;

        for (int i = 0; i < cases; i++) {
            mins += sc.nextInt();
            delayedSeconds += sc.nextInt();
        }

        if (delayedSeconds <= mins * 60) {
            System.out.println("measurement error");
        } else {
            System.out.println((double) delayedSeconds / (mins * 60));
        }
        sc.close();
    }

}
