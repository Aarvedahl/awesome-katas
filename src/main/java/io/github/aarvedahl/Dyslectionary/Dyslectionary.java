package io.github.aarvedahl.Dyslectionary;

import java.util.*;

public class Dyslectionary {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean end = false;

        while (scan.hasNext()) {
            ArrayList<String> words = new ArrayList<>();
            int max = 0;

            while(true) {
                String word = scan.nextLine();
                if(!scan.hasNext()) {
                    end = true;
                }

                max = word.length() > max ? word.length() : max;

                if(word.isEmpty()) {
                    break;
                }
                words.add(word);

                if (end)
                    break;
            }

            for(int i=0; i<words.size(); i++) {
                String word = words.get(i);
                int spaces = max -word.length();

                for(int j = 0; j < spaces; j++) {
                    word = " " + word;
                }

                words.set(i, word);
            }

            Collections.sort(words, new Comparator<String>() {
                @Override
                public int compare(String str1, String str2) {
                    for (int i = str1.length() - 1; i >= 0; i--)
                        if (str1.charAt(i) != str2.charAt(i))
                            return str1.charAt(i) - str2.charAt(i);
                    return 0;
                }
            });

            for (String word : words)
                System.out.println(word);

            if (!end)
                System.out.println();
        }

        scan.close();


    }

}
