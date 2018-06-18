package io.github.aarvedahl.Datum;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Datum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> days = new HashMap<>();
        days.put(0, "Sunday");
        days.put(1, "Monday");
        days.put(2, "Tuesday");
        days.put(3, "Wednesday");
        days.put(4, "Thursday");
        days.put(5, "Friday");
        days.put(6, "Saturday");
        while(scanner.hasNext()) {
            int day = scanner.nextInt();
            int month = scanner.nextInt();

        }
    }
}
