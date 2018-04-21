package io.github.aarvedahl;

import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        while(scanner.hasNextLine()) {

            String[] line1 = scanner.nextLine().split(" ");
            String[] line2 = scanner.nextLine().split(" ");

            int a = Integer.parseInt(line1[0]);
            int b = Integer.parseInt(line1[1]);
            int c = Integer.parseInt(line2[0]);
            int d = Integer.parseInt(line2[1]);

            int det = a * d - b * c;
            count++;
            System.out.println("Case " + count + ":");
            System.out.println((d/det) + " " + (-b/det));
            System.out.println((-c/det) + " " + (a/det));
            scanner.nextLine();
        }
    }
}
