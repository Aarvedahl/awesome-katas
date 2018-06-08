package io.github.aarvedahl.Carrots;

import java.util.Scanner;

public class Carrots {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            String[] input = scan.nextLine().split(" ");
            int contestants = Integer.parseInt(input[0]);
            int problems = Integer.parseInt(input[1]);


            for(int i=0; i<contestants; i++){
                String problem = scan.nextLine();
            }

            System.out.println(problems);
        }
    }
}
