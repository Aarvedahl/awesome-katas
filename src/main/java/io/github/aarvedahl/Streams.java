package io.github.aarvedahl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {


    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3);

        Stream<Integer> stream = numbers.stream()
                .map(e -> e *2);
        stream.forEach(System.out::println);

        int n = 101;
        int k = 68;

        System.out.println(compute(n, k));
    }

    public static double compute(int n, int k) {
        int index = n;
        int count = 0;

        double result = 0;

        while(count < k) {
            if(isPrime(index)) {
                result += Math.sqrt(index);
                count++;
            }
            index++;
        }

        return Stream.iterate(n, e-> e +1)
                .filter(Streams::isPrime)
                .mapToDouble(Math::sqrt)
                .limit(k)
                .sum();
    }

    public static boolean isPrime(int n) {
        return n > 1 && IntStream.range(2, n).noneMatch(i -> n%i == 0);
    }
}
