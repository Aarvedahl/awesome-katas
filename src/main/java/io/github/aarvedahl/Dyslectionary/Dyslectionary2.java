package io.github.aarvedahl.Dyslectionary;

import java.util.*;

public class Dyslectionary2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean end = false;

        while (scan.hasNext()) {
            ArrayList<String> words = new ArrayList<>();

            while(true) {
                String word = scan.nextLine();
                /*if(!scan.hasNext()) {
                    end = true;
                } */

                if(word.isEmpty()) {
                    break;
                }
                words.add(word);

                if(!scan.hasNext()) {
                    break;
                }
            }
            for (String word : words)
                System.out.println(word);

            if (!end)
                System.out.println();
        }

        scan.close();


    }

}
