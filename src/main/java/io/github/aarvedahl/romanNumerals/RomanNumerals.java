package io.github.aarvedahl.romanNumerals;

public class RomanNumerals {

    private enum Digit {
        X(10),
        IX(9),
        V(5),
        IV(4),
        I(1);

        private final int value;
        Digit(int value) {
            this.value = value;
        }
    }

    public String roman(int arabic) {
       for(Digit digit: Digit.values()) {
           if(arabic >= digit.value) {
               return digit.name() + roman(arabic - digit.value);
           }
       }
       return "";
    }

}
