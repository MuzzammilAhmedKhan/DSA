package com.exercises.bitwiseOperations;

public class NoOfDigitsInBinary {
    public static void main(String[] args) {
        int n = 10;
        int base = 2;
        int ans = (int)(Math.log(n) / Math.log(base)) + 1;
        System.out.println(ans);
    }
}
