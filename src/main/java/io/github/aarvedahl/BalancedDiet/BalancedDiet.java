package io.github.aarvedahl.BalancedDiet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

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

            List<Integer> lowest = new ArrayList<>(numList.subList(0, (numList.size()/2)));
            List<Integer> highest = new ArrayList<>(numList.subList(numList.size()/2, numList.size()));
            for(int i=0; i<lowest.size(); i++) {
                if(i % 2==0) {
                    meal2 += lowest.get(i);
                } else {
                    meal1 += lowest.get(i);
                }
            }
            for(int i=highest.size() -1; i>=0; i--) {
                if(i % 2==0) {
                    meal2 += highest.get(i);
                } else {
                    meal1 += highest.get(i);
                }
            }

            System.out.println(meal1 + " " + meal2);
        }
    }
}
