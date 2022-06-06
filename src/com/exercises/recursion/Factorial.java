package com.exercises.recursion;

public class Factorial {
    public static void main(String[] args) {
        long ans = factorial(5);
        System.out.println(ans);
    }

    static long factorial(int n){
        if(n <= 1){
            return 1;
        }

        return n * factorial(n - 1);
    }
}
