package io.github.aarvedahl.Oddities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Oddities {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            List<Integer> integerList = new ArrayList<>();
            int times = scan.nextInt();

            for(int i=0; i<times; i++) {
                integerList.add(scan.nextInt());
            }

            for(Integer integer: integerList) {
                if(integer % 2 == 0) {
                    System.out.println(integer + " is even");
                } else {
                    System.out.println(integer + " is odd");
                }
            }
        }
    }
}
