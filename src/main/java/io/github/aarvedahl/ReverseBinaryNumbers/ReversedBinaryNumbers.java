package io.github.aarvedahl.ReverseBinaryNumbers;

import java.math.BigInteger;
import java.util.Scanner;

public class ReversedBinaryNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLong()) {
            long original = sc.nextLong();
            String reversed = Long.toBinaryString(original);
            System.out.println(Long.toBinaryString(original));
            long binary = Long.parseLong(Long.toBinaryString(original));
            binary = Long.reverseBytes(binary);
            String binaryString = Long.toString(binary);
            System.out.println(parseLong(binaryString));
        }
    }

    private static long parseLong(String s) {
        return new BigInteger(s).longValue();
    }
}
