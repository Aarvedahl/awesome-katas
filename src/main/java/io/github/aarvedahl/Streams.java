package io.github.aarvedahl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams {


    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3);

        Stream<Integer> stream = numbers.stream()
                .map(e -> e *2);
        stream.forEach(System.out::println);
    }
}
