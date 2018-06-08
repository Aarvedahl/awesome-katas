package io.github.aarvedahl.sortingItOut;

public class SortCharacters {

    public String removeSpaces(String string) {
        String[] splitted = string.split(" ");
        StringBuilder builder = new StringBuilder();
        for(String splittedStrings: splitted){
            builder.append(splittedStrings);
        }
        return String.valueOf(builder);
    }

    public String toLowerCase(String upperCase) {
        return upperCase.toLowerCase();
    }

    public String sortString(String unsorted) {
        String temp;
        for(int i = 0; i<unsorted.length() -1; i++) {
            for(int j = 0; j<unsorted.length() -1; j++) {
                if(unsorted.charAt(i) < unsorted.charAt(j +1)){
                    System.out.println(unsorted.charAt(i));
                }
            }
        }
        return unsorted;

    }
}