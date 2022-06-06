package com.exercises.bitwiseOperations;

public class FindIthBit {
    public static void main(String[] args) {
        int n = 15649;
        int i = 5; //find this i th bit
        int ans = n & (1 << (i-1));
        System.out.println("mask : " + Integer.toBinaryString(1 << (i-1)));
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(ans));
    }
}
