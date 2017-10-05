package io.github.aarvedahl.romanNumerals;

import java.util.HashMap;

public class RomanNumerals {
    HashMap numerals = new HashMap();
    public RomanNumerals() {
        loadHashMap();
    }

    private void loadHashMap() {
        numerals.put(1, "I");
        numerals.put(5, "V");
    }

    public String makeIMarks(int number) {
        String roman = "";
        while(number > 0) {
            for(int i= number; i>= 0; i--) {
                if(numerals.containsKey(i)) {
                    roman += (String) numerals.get(i);
                    number -= i;
                }
            }
            /**
             * Hitta det numret som har den högsta key som är närmast till det numret vi matar in.
             * sedan minska itteratorn med det numret vi hittade.
             */
        }
        return roman;
    }

    private String findKey(int number) {

       return "";
    }
    /*
    public String makeIMarks(int i) {
        String roman = "";
        while(i > 0) {
            roman += "I";
            i--;
        }
        return roman;
    }

    public String makeVMarks(int i) {
        return "V";
    } */
}
