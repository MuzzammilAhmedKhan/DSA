package com.exercises.recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(20));
    }

    static int fibonacci(int n){
        if(n < 2){
            return n;
        }
<<<<<<< HEAD

        return fib(n - 1) + fib(n - 2);
    }

    static int fibFormula(int n){

        return (int)((Math.pow(((1 + Math.sqrt(5)) / 2) , n)) / Math.sqrt(5));
=======
        return fibonacci(n - 1) + fibonacci(n - 2);
>>>>>>> c7f6bbbec57829b15baeaeb88793abbeffd2ff3e
    }
}
