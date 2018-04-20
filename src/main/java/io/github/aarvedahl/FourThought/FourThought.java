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


import java.util.LinkedHashMap;
import java.util.Map;


public class FourThought {

    Map<Integer, String> map = new LinkedHashMap<>();

    private void addToMap() {
        map.put(4 + 4, "4 + 4");
        map.put(4 / 4, "4 / 4");
        map.put(4 * 4, "4 * 4");
        map.put(4 - 4, "4 - 4");
    }

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
