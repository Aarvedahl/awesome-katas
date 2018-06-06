package io.github.aarvedahl.QuadSelect;

import java.util.Scanner;

public class QuadSelect {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int x = scan.nextInt();
            int y = scan.nextInt();

            if(x > 0) {
                if(y > 0) {
                    System.out.println(1);
                } else {
                    System.out.println(4);
                }
            } else {
                if(y > 0) {
                    System.out.println(2);
                } else {
                    System.out.println(3);
                }
            }
        }
    }
}
