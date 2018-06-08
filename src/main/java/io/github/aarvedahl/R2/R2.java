package io.github.aarvedahl.R2;

import java.util.Scanner;

public class R2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()) {
            int r1 = scanner.nextInt();
            int s = scanner.nextInt();
            int r2 = (s * 2) - r1;
            System.out.println(r2);
        }

    }
}
