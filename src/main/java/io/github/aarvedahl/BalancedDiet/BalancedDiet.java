package io.github.aarvedahl.BalancedDiet;

import java.util.*;

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
            Collections.reverse(numList);

            for(Integer integer: numList) {
                if (meal1 <= meal2) {
                    meal1 += integer;
                } else {
                    meal2 += integer;
                }
            }
            System.out.println(meal1 + " " + meal2);
        }
    }

    public static void findBestNumber(List <Integer> integerList) {
        for(int i=0; i<integerList.size(); i++) {

        }
    }
    public static List<Integer> takeOneFromList(List<Integer> integerList, int sum) {
        int firstInteger = integerList.get(0);
        sum += firstInteger;
        integerList.remove(firstInteger);
        return integerList;
    }
}
