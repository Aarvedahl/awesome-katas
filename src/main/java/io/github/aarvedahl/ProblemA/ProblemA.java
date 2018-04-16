package io.github.aarvedahl.ProblemA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProblemA {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            List<String> emmaList = new ArrayList<String>();
            emmaList.add(sc.next());
            emmaList.add(sc.next());
            emmaList.add(sc.next());
            emmaList.add(sc.next());
            List<String> gunnarList = new ArrayList<String>();
            gunnarList.add(sc.next());
            gunnarList.add(sc.next());
            gunnarList.add(sc.next());
            gunnarList.add(sc.next());

            int emNum = calcNumbers(emmaList);
            int gunNum = calcNumbers(gunnarList);
            // solve test case and output answer
            if(emNum < gunNum) {
                System.out.println("Emma");
            } else if (emNum == gunNum) {
                System.out.println("Tie");
            } else {
                System.out.println("Gunnar");
            }

        }
    }

    private static int calcNumbers(List<String> list) {
        int sum = 0;
        for (String number: list) {
            sum += Integer.valueOf(number);
        }
        return sum;
    }

}
