package io.github.aarvedahl.ReverseBinaryNumbers;

import java.util.Scanner;

public class ReversedBinaryNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLong()) {
            long original = sc.nextLong();
            String binaryString = Long.toBinaryString(original);
            String reversed = reverse(binaryString);
            int decimalValue = Integer.parseInt(reversed, 2);
            System.out.println(decimalValue);
        }
    }

    public static String reverse(String input){
        char[] in = input.toCharArray();
        int begin=0;
        int end=in.length-1;
        char temp;
        while(end>begin){
            temp = in[begin];
            in[begin]=in[end];
            in[end] = temp;
            end--;
            begin++;
        }
        return new String(in);
    }
}
