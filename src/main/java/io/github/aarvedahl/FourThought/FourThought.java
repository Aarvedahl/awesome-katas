package io.github.aarvedahl.FourThought;

/*

Sample Input                Sample output
5
9                                     4 + 4 + 4 / 4 = 9
0                                   4 * 4 - 4 * 4 = 0
7                                   4 + 4 - 4 / 4 = 7
11                                    no solution
 24                                   4 * 4 + 4 + 4 = 24

 */


import java.util.HashMap;

public class FourThought {
// Kanske en hashmap med fördefinerade funktioner ?

    HashMap<Integer, String> map = new HashMap<>();

    private void addToMap() {
        map.put(4 + 4, "4 + 4");
        map.put(4 / 4, "4 / 4");
        map.put(4 * 4, "4 * 4");
        map.put(4 - 4, "4 - 4");
    }

    // Få tag på 4 + 4 och se hur långt vi är ifrån svaret.
    //  Loopa igeom hashmapen två gånger främst nycklarna och se om det matchar den siffran vi tar emot.
    // Om det gör det, skriv då ut strängen.
    public String writeSolution(int number) {
        String sumString = "";
        for(int key : map.keySet()) {
            for(int key2 : map.keySet()) {
                if(key + key2 == number) {
                    sumString = map.get(key) + " + " + map.get(key2);
                    return sumString;
                } else if(key - key2 == number) {
                    sumString = map.get(key) + " - " + map.get(key2);
                    return sumString;
                } else if(key * key2 == number) {
                    sumString = map.get(key) + " * " + map.get(key2);
                    return sumString;
          //      } else if(key / key2 == number) {
          //          sumString = map.get(key) + " / " + map.get(key2);
                } else {
                    sumString = "no solution";
                }
            }
        }
        return sumString;
    }

    public FourThought() {
        addToMap();
    }
}
