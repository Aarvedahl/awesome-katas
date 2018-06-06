package io.github.aarvedahl.Abracadabra;

import java.util.Scanner;

public class Abracadabra {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int times = scan.nextInt();

            for(int i=1; i<=times; i++) {
                System.out.println(i + " Abracadabra");
            }
        }
    }
}
