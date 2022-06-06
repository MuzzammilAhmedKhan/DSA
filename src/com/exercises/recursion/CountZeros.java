package com.exercises.recursion;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(counter(3001030));
    }

    static int counter(int n){
        return helper(n, 0);
    }
    // special pattern: how to pass a valur to above calls
    static int helper(int n, int c){
        if(n == 0){
            return c;
        }

        int rem = n % 10;
        if(rem == 0) {
            return helper(n / 10, c + 1);
        }

        return helper(n / 10, c);

    }
}
