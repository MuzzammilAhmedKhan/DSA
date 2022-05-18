package com.exercises.recursion;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(10));
    }

    static int fib(int n){
        if(n < 2){
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }

    static int fibFormula(int n){
        return (int)((Math.pow(((1 + Math.sqrt(5)) / 2) , n)) / Math.sqrt(5));
    }
}
